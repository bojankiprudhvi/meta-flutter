#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "multiplayer"
DESCRIPTION = "A game with basic multiplayer support."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "CLOSED"

SRCREV = "6a69d3b9664791f5dbb0c303dd645309a76fc004"
SRC_URI = "git://github.com/flutter/games.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "multiplayer"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-games-samples-multiplayer"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_APPLICATION_PATH = "samples/multiplayer"

inherit flutter-app
