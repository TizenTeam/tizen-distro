require message-port.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://review.tizen.org/platform/core/appfw/message-port-dbus;tag=b95c605d610b89486ce93e74461df0ac09e3e837;nobranch=1"

BBCLASSEXTEND += " native "

