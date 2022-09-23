// sbt build file for Scala code
// Author: Andrew Jarombek
// Date: 9/22/2022

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "example"

lazy val hello = (project in file("."))
  .settings(
    name := "Day6",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )