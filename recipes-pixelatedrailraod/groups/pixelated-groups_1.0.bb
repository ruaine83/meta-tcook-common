DESCRIPTION = "Add custom groups for Pixelated Railroad Layer"
LICENSE = "MIT"

PR = "r0"

inherit useradd

USERADD_PACKAGES = "${PN}"
ALLOW_EMPTY:${PN} = "1"

GROUPADD_PARAM:${PN} = "--system pixelatedrailroad; --system netdev; --system gpio; --system i2c; --system spi;"

do_configure() {
    bbwarn "Adding custom groups for Pixelated Railroad Layer"
}