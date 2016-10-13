SUMMARY = "Attributes without boilerplate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

SRC_URI[md5sum] = "5bcdd418f6e83e580434c63067c08a73"
SRC_URI[sha256sum] = "de6827a454d23716442b571bb35b0efb32a1b5c1037f09cfc7aaf405c7d68abc"

PR = "r0"

SRC_URI = "https://www.dropbox.com/s/5qw5nmcngd1yprh/python-attrs_16.0.0.orig.tar.gz?dl=0"

S = "${WORKDIR}/python-attrs-${PV}"

inherit setuptools

include python-package-split.inc
