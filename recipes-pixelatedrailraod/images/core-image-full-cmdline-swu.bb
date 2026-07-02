DESCRIPTION = "Make SWU Image from core-image-full-cmdline"
LICENSE = "MIT"

do_swupdate[depends] = "core-image-full-cmdline:do_ext4_deploy"

SWUUPDATE_IMAGES = " \
    core-image-full-cmdline \
"

SWUPDATE_IMAGE_FSTYPES[core-image-full-cmdline] = ".ext4.gz"

inherit swupdate

FILESEXTRAPATHS:prepend := "${THISDIR}/swu-files:"

SRC_URI += " \
    file://preInst.sh \
    file://postInst.sh \
    file://sw-description \
"

do_install:append() {
    bbwarn "Installing swu files defined in common layer"
}