require wrt-widgets.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/profile/common/wrt-widgets;tag=882ca33360066d01c1236b0f974070952bdda3e4;nobranch=1"

BBCLASSEXTEND += " native "

