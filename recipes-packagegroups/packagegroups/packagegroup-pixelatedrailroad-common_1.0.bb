DESCRIPTION = "Common packagegroup for Pixelated Railroad Layer"
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
    pixelated-groups \
    admin-user \
    prr-user \
    remote-user \
"