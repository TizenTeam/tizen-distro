require Modello-Phone.inc

PRIORITY = "10"

LIC_FILES_CHKSUM ??= "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI += "git://git.tizen.org/profile/ivi/Modello_Phone;tag=3bc3b528714442e2d5e77e054f019c028caad4e0;nobranch=1"

BBCLASSEXTEND += " native "

