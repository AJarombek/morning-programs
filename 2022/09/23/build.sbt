// sbt build file for Scala code
// Author: Andrew Jarombek
// Date: 9/23/2022

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "example"

lazy val hello = (project in file("."))
  .settings(
    name := "Day7",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % "3.2.2",
      "org.apache.spark" %% "spark-sql" % "3.2.2",
      "org.scalatest" %% "scalatest" % "3.2.12" % Test
    )
  )