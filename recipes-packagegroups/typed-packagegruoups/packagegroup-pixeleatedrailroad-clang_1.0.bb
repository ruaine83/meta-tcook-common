DESCRIPTION = "Recipes to be included in general-purpose images for Pixelated Railroad"
LICENSE = "MIT"

inherit packagegroup

# Packagegroups to be installed in general-purpose images
RDEPENDS:${PN} += " \
"


# Development tools and utilities for general-purpose images
RDEPENDS:${PN} += " \
    clang \
    valgrind \
"