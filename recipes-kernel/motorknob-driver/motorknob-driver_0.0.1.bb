SUMMARY = "MotorKnob Kernel Driver Module"
DESCRIPTION = "${SUMMARY}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module

SRC_URI = "git://github.com/Lukas-Sturm/MotorKnob-Driver.git;protocol=https;tag=${PV};branch=master"

#SRC_URI = "file://Makefile \
#           file://motorknob_driver.c \
#           file://COPYING \
#          "

S = "${WORKDIR}/git"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-motorknob-driver"
