# Class to hash a password from a given salt and add it to a userparam

DEPENDS:append = " openssl-native"

PASSWD_SALT ?= "prr_test_salt"
PASSWD_VALUE ?= "prr_test_password"

PASSWD_HASH = ""

THIS_USER ?= "prr"
THIS_GROUP ?= "${THIS_USER}"
OTHER_GROUPS ?= "users"

def useradd_param(d):

    import subprocess
    
    password = d.getVar("PASSWD_VALUE", True)
    salt = d.getVar("PASSWD_SALT", True)
    rounds = d.getVar("ROUNDS", True)
    user = d.getVar("THIS_USER", True)
    main_group = d.getVar("THIS_GROUP", True)
    extra_groups = d.getVar("OTHER_GROUPS", True)
    extra_groups = ",".join(extra_groups.split())

    result = subprocess.run(
        [
            "openssl",
            "passwd",
            "-6",
            "-salt", salt,
            password
        ],
        text=True,
        capture_output=True,
        check=True,
    )

    passwd_hash = result.stdout.strip()

    user_param = "--system --create-home --home-dir /home/" + user + " -g " + main_group + \
        " -G " + extra_groups + " --password '" + passwd_hash + "' " + user + ";"

    return user_param
