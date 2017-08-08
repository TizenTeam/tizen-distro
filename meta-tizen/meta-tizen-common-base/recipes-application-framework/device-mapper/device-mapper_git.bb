require device-mapper.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/upstream/device-mapper;tag=911d8280f4873d65ea93f12a23eddf79a40b38eb;nobranch=1"

BBCLASSEXTEND += " native "

