require vconf-internal-keys.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/appfw/vconf-internal-keys;tag=9d1f756ba5062a60eeea11cf0b2b7fd60461bcf5;nobranch=1"

BBCLASSEXTEND += " native "

