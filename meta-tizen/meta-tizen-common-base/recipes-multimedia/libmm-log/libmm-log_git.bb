require libmm-log.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/multimedia/libmm-log;tag=e3f09278c8a4aff3208aed8a23bcccf8d8af7542;nobranch=1"

BBCLASSEXTEND += " native "

