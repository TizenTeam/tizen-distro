require efl.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/upstream/efl;tag=fd139f7971d5c4b282ada9ab94c51563d771cf4b;nobranch=1"

BBCLASSEXTEND += " native "

