require pkgmgr.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/appfw/slp-pkgmgr;tag=5a9c95d025580510a18f80694f807dfdd569410f;nobranch=1"

BBCLASSEXTEND += " native "

