#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

DESCRIPTION = "Flutter Embedder with DRM GBM Backend."
CVE_PRODUCT = "flutter-drm-gbm-backend"

require sony-flutter.inc

DEPENDS += "libdrm"

do_install() {
    install -D -m0755 ${B}/flutter-drm-gbm-backend \
        ${D}${bindir}/flutter-drm-gbm-backend
}

FILES:${PN} = "${bindir}"
