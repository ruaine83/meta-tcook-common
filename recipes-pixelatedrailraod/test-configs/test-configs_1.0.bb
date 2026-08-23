DESCRIPTION = "Testing inclusion of Common Layer Dynamic Recipes"
LICENSE = "MIT"

do_configure[nostamp] = "1"
do_configure() {
    bbwarn "PRR Common Layer included for:
    MACHINE: ${MACHINE} 
    SWVERSION: ${SWVERSION}
    KERNEL_VERSION: ${KERNEL_VERSION}
    KERNEL_VERSION_STRING: ${KERNEL_VERSION_STRING}

    Image Setup:

    PACKAGE_CLASSES: ${PACKAGE_CLASSES}
    EXTRA_IMAGE_FEATURES: ${EXTRA_IMAGE_FEATURES}
    "
}