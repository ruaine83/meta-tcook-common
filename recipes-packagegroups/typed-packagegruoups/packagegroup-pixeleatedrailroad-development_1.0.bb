DESCRIPTION = "Recipes to be included in general-purpose images for Pixelated Railroad"
LICENSE = "MIT"

inherit packagegroup

# Depends on arch-specific, dynamically-renamed packages (e.g. glog), so it can't be allarch
PACKAGE_ARCH = "${TUNE_PKGARCH}"

# Packagegroups to be installed in general-purpose images
RDEPENDS:${PN} += " \
    packagegroup-core-ssh-openssh \
"


# Development tools and utilities for general-purpose images
RDEPENDS:${PN} += " \
    gcc g++ gdb \
    make cmake \
    python3 python3-pip \
    go \
    procps \
    strace \
    rust cargo \
    nodejs nodejs-npm \
    lua \
    perl \
    ruby \
    googletest glog \
    iputils iputils-arping \
    postgresql-client sqlite3 \
"

# Container Managers, can only select one of these

RDEPENDS:${PN} += " \
    podman podman-compose buildah \
"

# RDEPENDS:${PN} += " \
#     docker-moby docker-compose \
# "