require nfc-manager-neard.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/connectivity/nfc-manager-neard;tag=9dd33b9924fd8bd477b2c416a44d9f9f2fd83ca1;nobranch=1"

BBCLASSEXTEND += " native "

