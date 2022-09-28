// sbt build file for Scala code
// Author: Andrew Jarombek
// Date: 9/26/2022

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "example"

// Scala Linting configuration
wartremoverErrors ++= Warts.unsafe

lazy val day10 = (project in file("."))
  .settings(
    name := "Day10",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.12" % Test
    )
  )