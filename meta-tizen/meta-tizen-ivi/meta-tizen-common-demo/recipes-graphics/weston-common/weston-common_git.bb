require weston-common.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/profile/common/weston-common;tag=bba9e6c2ec15757449e129454efb97b4a16925aa;nobranch=1"

BBCLASSEXTEND += " native "

