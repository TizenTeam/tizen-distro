require deviced.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/system/deviced;tag=a8523c4eab30ad4decd1972aa5dd0934ee42b1ae;nobranch=1"

BBCLASSEXTEND += " native "
