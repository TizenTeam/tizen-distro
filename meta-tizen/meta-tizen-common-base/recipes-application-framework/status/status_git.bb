require status.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/appfw/status;tag=2afa6a6447a70d20f63c67d5ae59cf26608146d9;nobranch=1"

BBCLASSEXTEND += " native "

