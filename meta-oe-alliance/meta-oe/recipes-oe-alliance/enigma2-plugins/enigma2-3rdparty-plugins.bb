DESCRIPTION = "pli plugins"
LICENSE = "CLOSED"

SRCREV = "${AUTOREV}"
PV = "${IMAGE_VERSION}+gitr${SRCPV}"
PKGV = "${IMAGE_VERSION}+gitr${GITPKGV}"
PR = "r0"

inherit deploy gitpkgv

SRC_URI="git://github.com/oe-alliance/3rdparty-plugins.git;protocol=git"

EXTRA_OECONF = " \
    BUILD_SYS=${BUILD_SYS} \
    HOST_SYS=${HOST_SYS} \
    STAGING_INCDIR=${STAGING_INCDIR} \
    STAGING_LIBDIR=${STAGING_LIBDIR} \
"

ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git"

DEPLOY_DIR = "${TMPDIR}/deploy"

THIRDPARTY_PLUGINS = " \
    enigma2-plugin-extensions-atmolightd_0.7-pre22_all.ipk \
    enigma2-plugin-extensions-bildonline_3.1rc6_mips32el.ipk \
    enigma2-plugin-extensions-bluray_1.5rc3_mips32el.ipk \
    enigma2-plugin-extensions-boblight-enigma2_0.8r8_mips32el.ipk \
    enigma2-plugin-extensions-camofs_9.19_all.ipk \
    enigma2-plugin-extensions-chefkoch_1.4rc9_all.ipk \
    enigma2-plugin-extensions-clevertanken_0.7rc1_all.ipk \
    enigma2-plugin-extensions-csfd_10-85-20150429_all.ipk \
    enigma2-plugin-extensions-cyrussettings_1.0.0_all.ipk \
    enigma2-plugin-extensions-digitalfernsehen_1.1rc10_all.ipk \
    enigma2-plugin-extensions-dvrproviderplayer_1.14_all.ipk \
    enigma2-plugin-extensions-ehue_0.2-r0_all.ipk \
    enigma2-plugin-extensions-enigmalight_0.2-rc1_all.ipk \
    enigma2-plugin-extensions-exodus_2.0_r1_all.ipk \
    enigma2-plugin-extensions-facebook_1.4_mips32el.ipk \
    enigma2-plugin-extensions-filesearchfs_2.53_all.ipk \
    enigma2-plugin-extensions-focusonline_1.0rc10_all.ipk \
    enigma2-plugin-extensions-fragmutti_0.5_all.ipk \
    enigma2-plugin-extensions-gmailreader-oe2.0_1.3_all.ipk \
    enigma2-plugin-extensions-googlenewsreader_1.0_mips32el.ipk \
    enigma2-plugin-extensions-hdmitest_0.4_mipsel.ipk \
    enigma2-plugin-extensions-hetweer_3.7r2_all.ipk \
    enigma2-plugin-extensions-iptvbouquet_1.0_r0_all.ipk \
    enigma2-plugin-extensions-isettinge2-3.3.8-oe2.0-${@base_contains("TARGET_ARCH", "sh4", "sh4" , "mips32el", d)}.ipk \
    enigma2-plugin-extensions-kicker_3.4rc10_all.ipk \
    enigma2-plugin-extensions-kino_1.6rc9_all.ipk \
    enigma2-plugin-extensions-kodidirect_3.0_r0_all.ipk \
    enigma2-plugin-extensions-livefootball_6.1_all.ipk \
    enigma2-plugin-extensions-mediainfo_3.0.0_all.ipk \
    enigma2-plugin-extensions-mediaportal-wallicons.ipk \
    enigma2-plugin-extensions-moviebrowser_3.6rc9_all.ipk \
    enigma2-plugin-extensions-mp3browser_1.9rc9_all.ipk \
    enigma2-plugin-extensions-netspeedtest_1.0rc1_all.ipk \
    ${@base_contains('MACHINE_BRAND', 'Vu+', '' , 'enigma2-plugin-extensions-openopera_1.0-r0_mips32el.ipk', d)} \
    enigma2-plugin-extensions-opkg-tools_1.3_mipsel.ipk \
    enigma2-plugin-extensions-oscamstatusview_0.7rc1_mips32el.ipk \
    enigma2-plugin-extensions-piconmanager_2.2-20150329-r0_all.ipk \
    enigma2-plugin-extensions-piconsupdater_0.3.6_mips32el.ipk \
    enigma2-plugin-extensions-picturecenterfs_7.34_all.ipk \
    enigma2-plugin-extensions-planerfs_6.61_all.ipk \
    enigma2-plugin-extensions-pluginspanel_1.0_r01_all.ipk \
    enigma2-plugin-extensions-pluginupdater_0.1r2_all.ipk \
    enigma2-plugin-extensions-pravoslavietv_0.2_all.ipk \
    enigma2-plugin-extensions-pzyemail_0.8-20150614_all.ipk \
    enigma2-plugin-extensions-screengrabber_2.5_all.ipk \
    enigma2-plugin-extensions-screensaver_5.7.1_all.ipk \
    enigma2-plugin-extensions-sherlock_5.01r1_mipsel.ipk \
    enigma2-plugin-extensions-skyrecorder_1.6.1_all.ipk \
    enigma2-plugin-extensions-songs-to_0.1_mips32el.ipk \
    enigma2-plugin-extensions-spiegelonline_2.7rc2_all.ipk \
    enigma2-plugin-extensions-spinnerselector_2.1rc7_mips32el.ipk \
    enigma2-plugin-extensions-sport1ticker_1.3_all.ipk \
    enigma2-plugin-extensions-sportportal_2013_all.ipk \
    enigma2-plugin-extensions-sundtekcontrolcenter_20160830-1_all.ipk \
    enigma2-plugin-extensions-tectimetv_3.1_all.ipk \
    enigma2-plugin-extensions-thetvdb_0.7-20120607-r2_mips32el.ipk \
    enigma2-plugin-extensions-tmbd_7.5r1_all.ipk \
    enigma2-plugin-extensions-translator_1.0rc1_all.ipk \
    enigma2-plugin-extensions-transmission_2.84_all.ipk \
    enigma2-plugin-extensions-tsmedia_11.3_all.ipk \
    enigma2-plugin-extensions-tstube_1.2_all.ipk \
    enigma2-plugin-extensions-tvspielfilm_6.4rc12_all.ipk \
    enigma2-plugin-extensions-verkehrsinfo_1.1rc1_mips32el.ipk \
    enigma2-plugin-extensions-vcs_2.4_all.ipk \
    enigma2-plugin-extensions-vhannibalautosettings_1.1_mips32el.ipk \
    enigma2-plugin-extensions-vuplusforum_0.8rc1_all.ipk \
    enigma2-plugin-extensions-webmedia_14.0_r0_all.ipk \
    enigma2-plugin-extensions-webradiofs_14.53_all.ipk \
    enigma2-plugin-extensions-weerinfo_2.3_all.ipk \
    enigma2-plugin-extensions-wikipedia_2.2rc10_all.ipk \
    enigma2-plugin-extensions-wwech_1.03_all.ipk \
    enigma2-plugin-extensions-xbmcaddons_8.1_r0_all.ipk \
    enigma2-plugin-extensions-xbmcwetter_1.3rc5_all.ipk \
    enigma2-plugin-extensions-zdfnewmediathek_1.7rc6_all.ipk \
    enigma2-plugin-feeds-picons.xyz_2015-08-31--19-55-30_all.ipk \
    enigma2-plugin-systemplugins-bouquetsprotection_0.2-rc1_all.ipk \
    enigma2-plugin-systemplugins-channelselectionnavigator_1.1_mipsel.ipk \
    enigma2-plugin-systemplugins-extnumberzap_1.17_all.ipk \
    enigma2-plugin-systemplugins-recinfobar_1.22rc2_mips32el.ipk \
    "

do_install() {
}
python populate_packages_prepend () {
    p = ""
    plugins = bb.data.getVar('THIRDPARTY_PLUGINS', d, 1)

    if plugins is not None:
        for package in plugins.split():
            p += package.split('_')[0] + " "

    bb.data.setVar('PACKAGES', p, d)
}

do_deploy() {
    install -d 0755 ${WORKDIR}/deploy-ipk/3rdparty

    for i in ${PLI_PLUGINS}; do
        if [ -f $i ]; then
            install -m 0644 $i ${WORKDIR}/deploy-ipk/3rdparty;
            install -m 0644 $i ${DEPLOY_DIR}/ipk/3rdparty;
        fi
    done;

    pkgdir=${DEPLOY_DIR_IPK}/3rdparty
    if [ -e $pkgdir ]; then
        chmod 0755 $pkgdir
    fi
}

addtask do_deploy before do_package_write after do_package_write_ipk
