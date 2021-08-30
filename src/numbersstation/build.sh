#!/bin/bash

# exit on error
set -e
javac -classpath /home/ciaron/processing/core/library/core.jar -d . *.java
#jar -cf NumbersStation.jar numbersstation
jar cmvf META-INF/manifest.mf NumbersStation.jar numbersstation
cp NumbersStation.jar  ~/sketchbook/libraries/NumbersStation/library/NumbersStation.jar

