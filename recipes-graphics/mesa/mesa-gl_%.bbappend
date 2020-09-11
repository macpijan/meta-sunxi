# remove provided `khrplatform.h` header in favour of the version provided from
# mali-blobs repo
do_install_append() {
    rm -rf ${D}${includedir}/KHR/khrplatform.h
}
