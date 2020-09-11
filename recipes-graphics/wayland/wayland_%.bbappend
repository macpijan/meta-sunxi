# remove provided `libwayland-egl` library in favour of the version provided
# from mali blobs repo
do_install_append() {
    rm -f ${D}${libdir}/libwayland-egl*
    rm -f ${D}${libdir}/pkgconfig/wayland-egl.pc
}
