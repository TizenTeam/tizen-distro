#!/usr/bin/python -tt
#
# Copyright (c) 2011 Intel, Inc.
#
# This program is free software; you can redistribute it and/or modify it
# under the terms of the GNU General Public License as published by the Free
# Software Foundation; version 2 of the License
#
# This program is distributed in the hope that it will be useful, but
# WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
# or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
# for more details.
#
# You should have received a copy of the GNU General Public License along
# with this program; if not, write to the Free Software Foundation, Inc., 59
# Temple Place - Suite 330, Boston, MA 02111-1307, USA.

import os, sys, re
import ConfigParser

from mic import msger
from mic import kickstart
from mic.utils import misc, runner, errors


def get_siteconf():
    mic_path = os.path.dirname(__file__)
    eos = mic_path.find('scripts') + len('scripts')
    scripts_path = mic_path[:eos]

    return scripts_path + "/lib/image/config/wic.conf"

class ConfigMgr(object):
    prefer_backends = ["zypp", "yum"]

    DEFAULTS = {'common': {
                    "distro_name": "Default Distribution",
                    "plugin_dir": "/usr/lib/wic/plugins", # TODO use prefix also?
                },
                'create': {
                    "tmpdir": '/var/tmp/wic',
                    "cachedir": '/var/tmp/wic/cache',
                    "outdir": './wic-output',

                    "arch": None, # None means auto-detect
                    "pkgmgr": "auto",
                    "name": "output",
                    "ksfile": None,
                    "ks": None,
                    "repomd": None,
                    "local_pkgs_path": None,
                    "release": None,
                    "logfile": None,
                    "record_pkgs": [],
                    "pack_to": None,
                    "name_prefix": None,
                    "name_suffix": None,
                    "copy_kernel": False,
                    "install_pkgs": None,
                    "repourl": {},
                    "localrepos": [],  # save localrepos
                    "runtime": "bootstrap",
                },
                'chroot': {
                    "saveto": None,
                },
                'convert': {
                    "shell": False,
                },
                'bootstrap': {
                    "rootdir": '/var/tmp/wic-bootstrap',
                    "packages": [],
                },
               }

    # make the manager class as singleton
    _instance = None
    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super(ConfigMgr, cls).__new__(cls, *args, **kwargs)

        return cls._instance

    def __init__(self, ksconf=None, siteconf=None):
        # reset config options
        self.reset()

        if not siteconf:
            siteconf = get_siteconf()

        # initial options from siteconf
        self._siteconf = siteconf

        if ksconf:
            self._ksconf = ksconf

    def reset(self):
        self.__ksconf = None
        self.__siteconf = None

        # initialize the values with defaults
        for sec, vals in self.DEFAULTS.iteritems():
            setattr(self, sec, vals)

    def __set_ksconf(self, ksconf):
        if not os.path.isfile(ksconf):
            msger.error('Cannot find ks file: %s' % ksconf)

        self.__ksconf = ksconf
        self._parse_kickstart(ksconf)
    def __get_ksconf(self):
        return self.__ksconf
    _ksconf = property(__get_ksconf, __set_ksconf)

    def _parse_kickstart(self, ksconf=None):
        if not ksconf:
            return

        ksconf = misc.normalize_ksfile(ksconf,
                                       self.create['release'],
                                       self.create['arch'])

        ks = kickstart.read_kickstart(ksconf)

        self.create['ks'] = ks
        self.create['name'] = os.path.splitext(os.path.basename(ksconf))[0]

        self.create['name'] = misc.build_name(ksconf,
                                              self.create['release'],
                                              self.create['name_prefix'],
                                              self.create['name_suffix'])

    def set_runtime(self, runtime):
        if runtime not in ("bootstrap", "native"):
            msger.error("Invalid runtime mode: %s" % runtime)

        if misc.get_distro()[0] in ("tizen", "Tizen"):
            runtime = "native"
        self.create['runtime'] = runtime

configmgr = ConfigMgr()
