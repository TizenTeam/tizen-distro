require libSM.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/upstream/libSM;tag=b5df5f309d12616c47edc40c2c6e852ec20f88fb;nobranch=1"

BBCLASSEXTEND += " native "

