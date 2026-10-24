DESCRIPTION = "Bitbake Recipe for defining packages for Pixelated Railroad Layer"
SUMMARY = "Packages to include in Builds"
LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = "${TUNE_PKGARCH}"

# Add various packages to the packagegroup
RDEPENDS:${PN} += " \
    packagegroup-pixeleatedrailroad-general \
    packagegroup-pixeleatedrailroad-development \
    packagegroup-pixeleatedrailroad-clang \
"

# Individual recipes for Pixelated Railroad common customizations
RDEPENDS:${PN} += " \
    "
    
# User recipe definitions
RDEPENDS:${PN} += " \
    test-configs \
    pixelated-groups \
    admin-user \
    prr-user \
    remote-user \
"

# Packages to remove from the build
RDEPENDS:${PN} += " \
    packagegroup-pixelatedrailroad-remove \
"