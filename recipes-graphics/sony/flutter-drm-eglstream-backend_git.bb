#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

DESCRIPTION = "Flutter Embedder with EGLStream Backend."
CVE_PRODUCT = "flutter-drm-eglstream"

REQUIRED_DISTRO_FEATURES += "wayland"

require sony-flutter.inc

DEPENDS += "libdrm"

do_install() {
    install -D -m0755 ${B}/flutter-drm-eglstream-backend \
        ${D}${bindir}/flutter-drm-eglstream-backend
}

FILES:${PN} = "${bindir}"
