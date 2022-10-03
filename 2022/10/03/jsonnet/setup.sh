#!/bin/zsh

# Commands for setting up and working with jsonnet.
# Author: Andrew Jarombek
# Date: 10/3/2022

# Install jsonnet on MacOS.
brew install jsonnet

jsonnet -v

# Convert the jsonnet file to JSON
jsonnet sample.jsonnet

# ...and save it to a file
jsonnet sample.jsonnet > out/sample.json
jsonnet airport.jsonnet > out/airport.json