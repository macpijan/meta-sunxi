SUMMARY = "sunxi mali kernel driver for mainline Linux"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI = "git://github.com/mripard/sunxi-mali.git;protocol=https;branch=master"

PV = "r6p2"

SRCREV = "d7d58f514fcad320278c538fc924e34b934dc08f"

SRC_URI += "file://0001-Makefile-use-KERNEL_BUILD_ARTIFACTS_DIR-for-.config-.patch"

S = "${WORKDIR}/git/r6p2/src/devicedrv/mali"

export KDIR = "${KERNEL_SRC}"
export KERNEL_BUILD_ARTIFACTS_DIR = "${STAGING_KERNEL_BUILDDIR}"

do_compile_prepend () {
    # apply patches from git tree
    cd ${WORKDIR}/git && bash build.sh -r r6p2 -a
    cd -
}

EXTRA_OEMAKE += " \
    USING_UMP=0 \
    BUILD=release \
    USING_PROFILING=0 \
    MALI_PLATFORM=sunxi \
    USING_DVFS=1 \
    USING_DEVFREQ=1 \
"

MODULES_INSTALL_TARGET = "install"
