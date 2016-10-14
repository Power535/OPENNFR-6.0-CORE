SUMMARY = "Python attributes without boilerplate"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e36e88132159fd857b145b9ec72beed3"

SRC_URI[md5sum] = "b249368dd021fde1c06b4802867c0913"
SRC_URI[sha256sum] = "ded68d4e424115ed44e5c83c2a901a0b6157a959079d7591d92106ffd3ada380"

PR = "r0"

SRC_URI = "https://www.dropbox.com/s/zwnkwuoxeeqixw8/python-characteristic_14.3.0.orig.tar.gz?dl=0"

S = "${WORKDIR}/python-characteristic-${PV}"

include python-package-split.inc
