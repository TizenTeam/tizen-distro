require dlog.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/system/dlog;tag=c43bce370f4aaa09f48df4e2c1d2b99f133526d0;nobranch=1"

BBCLASSEXTEND += " native "

