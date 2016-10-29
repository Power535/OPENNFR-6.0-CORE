SUMMARY = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
                    
ALLOW_EMPTY_${PN} = "1"

PV = "${IMAGE_VERSION}"
PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = "\
    oe-alliance-base \
    opennfr-enigma2 \
    opennfr-bootlogo \
    opennfr-version-info \
    opennfr-cam \
    opennfr-settings \    
    openssh-sftp-server \
    ntfs-3g \
    hddtemp \
    busybox-cron \
    python-imaging \
    python-cfscrape \
    python-js2py \
    python-requests \
    python-ipaddress  \
    python-netifaces \
    python-pysnmp-se \
    ofgwrite \
    libcrypto-compat-0.9.8 \
    python-gdata \
    libshowiframe \
    dvbsnoop \
    librtmp \
    rtmpdump \
    iperf \
    mjpegtools \
    packagegroup-base-smbfs-client \
    packagegroup-base-smbfs-server \
    packagegroup-base-smbfs-utils \
    packagegroup-base-nfs \
    enigma2-plugin-drivers-usbserial \
    bash \
    "
