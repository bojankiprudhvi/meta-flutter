#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "interstitial_example"
DESCRIPTION = "Example project for demoing interstitial ads."
AUTHOR = "Goolge Ads"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "ccb243acf4a693fa47c8ee6795058b1bb2e80d53"
SRC_URI = "git://github.com/googleads/googleads-mobile-flutter.git;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "interstitial_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "googleads-flutter-samples-admob-interstitial-example"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "samples/admob/interstitial_example"

inherit flutter-app
