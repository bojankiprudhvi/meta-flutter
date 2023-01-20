SUMMARY = "Flutter Gallery Application"
DESCRIPTION = "Flutter Gallery Application"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/flutter/gallery"
BUGTRACKER = "https://github.com/flutter/gallery/issues"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3ac21e3d8ebe7dd79f273ca11b9e7b4e"

SRC_URI = "http://mod.lge.com/hub/flutter-webOS/test_applications/custom_fonts.git;lfs=0;protocol=https"

SRCREV = "026ebaaa76b47833531e76b210c3ce898d8ddaf1"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "font"

inherit flutter-app

FILES_${PN} += "${datadir}/homescreen"
