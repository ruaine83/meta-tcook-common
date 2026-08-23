DESCRIPTION = "Recipes to be included in general-purpose images for Pixelated Railroad"
LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = "${TUNE_PKGARCH}"

# Packagegroups to be installed in general-purpose images
RDEPENDS:${PN} += " \
    packagegroup-core-ssh-openssh \
"


# General tools and utilities for general-purpose images
RDEPENDS:${PN} += " \
    busybox \
    bash \
    gawk \
    git \
    openssh \
    sudo \
    vim \
    nano \
    htop \
    tmux \
    screen \
    strace \
    iptables \
    net-tools \
    iftop \
    iotop \
    lsof \
    rsync \
    wget \
    curl \
    unzip \
    zip \
    pciutils \
    usbutils \
    lsb-release \
    nfs-utils \
    openssh \
"