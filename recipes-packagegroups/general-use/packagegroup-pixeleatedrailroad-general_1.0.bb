DESCRIPTION = "Recipes to be included in general-purpose images for Pixelated Railroad"
LICENSE = "MIT"

inherit packagegroup

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
    docker-moby docker-compose \
    podman \
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