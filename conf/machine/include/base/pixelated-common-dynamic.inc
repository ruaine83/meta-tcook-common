# Dynamic layer configuration for Pixelated common recipes

BBFILES_DYNAMIC += " \
    raspberrypi:${LAYERDIR}/dynamic-layers/recipes-*/*/*.bb \
    raspberrypi:${LAYERDIR}/dynamic-layers/recipes-*/*/*.bbappend"
