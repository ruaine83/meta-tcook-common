DESCRIPTION = "Common packagegroup for Pixelated Railroad Layer"
LICENSE = "MIT"

inherit packagegroup

# Add various packages to the packagegroup
RDEPENDS:${PN} += " \
    packagegroup-pixeleatedrailroad-general \
"

# Individual recipes for Pixelated Railroad common customizations
RDEPENDS:${PN} += " \
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
    "
    
# User recipe definitions
RDEPENDS:${PN} += " \
    pixelated-groups \
    admin-user \
    prr-user \
    remote-user \
"