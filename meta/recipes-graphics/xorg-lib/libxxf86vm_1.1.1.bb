DESCRIPTION = "X11 XFree86 video mode extension library"

require xorg-lib-common.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=0fe722b85f452ce13ca763f323ff5da8"

DEPENDS += "libxext xf86vidmodeproto"

PR = "r0"
PE = "1"

XORG_PN = "libXxf86vm"

SRC_URI[md5sum] = "34dc3df888c164378da89a7deeb245a0"
SRC_URI[sha256sum] = "21cae9239aefd59353a4ddb0d6ed890402b681570ccd4bc977d80a75a020239e"
