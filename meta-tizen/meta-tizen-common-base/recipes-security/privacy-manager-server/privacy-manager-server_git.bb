require privacy-manager-server.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/platform/core/security/privacy-manager;tag=c3cc4cfe5aedaa35bf10107c473da4e0bc476f50;nobranch=1"

BBCLASSEXTEND += " native "

