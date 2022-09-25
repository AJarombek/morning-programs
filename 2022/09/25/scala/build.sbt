// sbt build file for Scala code
// Author: Andrew Jarombek
// Date: 9/25/2022

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "example"

lazy val hello = (project in file("."))
  .settings(
    name := "Day9",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.12" % Test
    )
  )