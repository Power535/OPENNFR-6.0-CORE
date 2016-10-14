SUMMARY = "A collection of ASN.1-based protocols modules"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=425e62320d430219736139b134db2fc4"

SRC_URI[md5sum] = "178129bc7fbf07215c25230c5f053f81"
SRC_URI[sha256sum] = "10561934f1829bcc455c7ecdcdacdb4be5ffd3696f26f468eb6eb41e107f3837"

RDEPENDS_${PN} = "python-pyasn1"

PR = "r0"

SRC_URI = "http://axforum.de/openpli/pyasn1-modules-0.0.8.tar.gz"

S = "${WORKDIR}/pyasn1-modules-${PV}"

inherit pypi

include python-package-split.inc
