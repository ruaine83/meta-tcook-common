SUMMARY = "Setting up Cgroups and such for Docker and Podman on the Raspberry Pi Zero W2, 3, 4, and 5"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += " \
    file://cgroups-enable.cfg \
    "