# Start from Poky policy and customize from here.
require conf/distro/poky.conf

DISTRO = "pixelatedrailroad"
DISTRO_NAME = "Pixelated Railroad"
DISTROOVERRIDES =. "pixelatedrailroad:"

# Includes for common base configurations

# Enable containerization support features in the kernel
DISTRO_FEATURES:append = " virtualization systemd"

# Configure standard systemd init (highly recommended for Docker)
VIRTUAL-RUNTIME_init_manager = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED:append = " sysvinit"


