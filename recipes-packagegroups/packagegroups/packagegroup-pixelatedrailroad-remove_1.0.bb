DESCRIPTION = "Bitbake Recipe for defining packages for Pixelated Railroad Layer"
SUMMARY = "Packages to REMOVE from Builds"
LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = "${TUNE_PKGARCH}"

# Add various packages to the packagegroup
RDEPENDS:${PN}:remove = " \
"