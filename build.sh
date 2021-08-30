#!/bin/bash

# exit on error
set -e
javac -classpath /home/ciaron/processing/core/library/core.jar -d . src/numbersstation/*.java
jar cmvf src/META-INF/manifest.mf library/NumbersStation.jar numbersstation

#cp NumbersStation.jar  ~/sketchbook/libraries/NumbersStation/library/NumbersStation.jar
# copy the directory structure to the sketchbook library
export SKETCHBOOK=/home/ciaron/sketchbook/libraries/NumbersStation
mkdir -p $SKETCHBOOK
cp -r examples library library.properties src $SKETCHBOOK
