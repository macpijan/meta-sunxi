PACKAGECONFIG_class-target_append = " egl glesv2"

# |
# /work/build/tmp/work/armv7vet2hf-neon-poky-linux-gnueabi/cairo/1.16.0-r0/recipe-sysroot-native/usr/bin/arm-poky-linux-gnueabi/../../libexec/arm-poky-linux-gnueabi/gcc/arm-poky-linux-gnueabi/9.3.0/ld:
# warning: libwayland-client.so.0, needed by
# /work/build/tmp/work/armv7vet2hf-neon-poky-linux-gnueabi/cairo/1.16.0-r0/recipe-sysroot/usr/lib/libEGL.so,
# not found (try using -rpath or -rpath-link)

DEPENDS += "wayland"
