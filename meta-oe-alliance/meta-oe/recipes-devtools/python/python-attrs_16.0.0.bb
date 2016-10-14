SUMMARY = "Attributes without boilerplate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI[md5sum] = "44eefb6db8b258becb94243ac1247a46"
SRC_URI[sha256sum] = "ddf3634d68c34811767a02310e97a7cea8b17dac11773487e55d94421d023d2a"

PR = "r0"

SRC_URI = "https://www.dropbox.com/s/5qw5nmcngd1yprh/python-attrs_16.0.0.orig.tar.gz?dl=0"

S = "${WORKDIR}/python-attrs-${PV}"

inherit setuptools

include python-package-split.inc
