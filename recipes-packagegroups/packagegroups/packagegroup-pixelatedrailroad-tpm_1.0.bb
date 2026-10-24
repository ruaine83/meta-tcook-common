DESCRIPTION = "Bitbake Recipe for defining packages for PixelatedRailroad Builds"
SUMMARY = "Packages to include to ensure TPM2 support"
LICENSE = "MIT"

inherit packagegroup

PACKAGE_ARCH = "${TUNE_PKGARCH}"

# Packagegroups
RDEPENDS:${PN} += " \
    packagegroup-security-tpm2 \
    "


# Individual packages for TPM2 support
RDEPENDS:${PN} += " \
    tpm2-tools \
    tpm2-tss \
    "