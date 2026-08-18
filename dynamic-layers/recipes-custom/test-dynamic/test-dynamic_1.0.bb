DESCRIPTION = "Testing inclusion of Common Layer Dynamic Recipes"
LICENSE = "MIT"

do_configure[nostamp] = "1"
do_configure() {
    bbwarn "PRR Common Layer included for ${MACHINE} with SWVERSION: ${SWVERSION}"
}