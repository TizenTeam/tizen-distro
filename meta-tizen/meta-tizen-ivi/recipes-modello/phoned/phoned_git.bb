require phoned.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/profile/ivi/phoned;tag=7e698bc380b479faec28ffd192058ee162de9cb5;nobranch=1"

BBCLASSEXTEND += " native "

