#!/usr/bin/env bash

# sbt Scala setup exploration
# Source: https://www.scala-sbt.org/1.x/docs/Getting-Started.html
# Author: Andrew Jarombek
# Date: 9/22/2022

touch build.sbt

# Start sbt shell
sbt

# Compile the code
compile

# Compile the code and recompile on source code changes
~compile

# Run the code
run

# Check the scala version
scalaVersion

# Set the scala version from the shell
set ThisBuild / scalaVersion := "2.13.8"

# Save the session to build.sbt
session save

# Reload settings from build.sbt
reload

# Run Scala tests
test

# Exit sbt shell
exit