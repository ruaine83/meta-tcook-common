DESCRIPTION = "Definitions for the admin-user recipe, which creates an administrative user account on the system."
LICENSE = "MIT"
AUTHOR = "Travis Cook <pixelatedrailroad@gmail.com>"

inherit useradd
inherit passwd-salt

ALLOW_EMPTY:${PN} = "1"

PR = "r0"

USERADD_PACKAGES = "${PN}"

RDEPENDS:${PN} += " \
    bash \
    pixelated-groups \
"

USERADD_DEPENDS = " \
    pixelated-groups \
"

THIS_USER = "admin"
THIS_GROUP = "${THIS_USER}"
GROUPADD_PARAM:${PN} = "--system ${THIS_GROUP}"
OTHER_GROUPS = "adm sudo dialout audio video pixelatedrailroad plugdev users input netdev gpio i2c spi"


PASSWD_SALT = "${@bb.utils.contains('IMAGE_FEATURES', 'release', 'Diam0nd188#', 'pixeleatedrail', d)}"
PASSWD_VALUE = "${@bb.utils.contains('IMAGE_FEATURES', 'release', 'Nintendo8#', 'prrtest', d)}"

USERADD_PARAM:${PN} = "${@useradd_param(d)}"

do_deploy[nostamp] = "1"
do_deploy:append () {
    bbwarn "User ${THIS_USER} has been added with password: ${PASSWD_VALUE}"
    bbwarn "User Params:
    ${USERADD_PARAM}
    ${GROUPADD_PARAM}
    "
}

pkg_postinst_ontarget:${PN} () {
    usermod -s /bin/bash ${THIS_USER}
}