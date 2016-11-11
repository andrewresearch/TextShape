/** Build file for TextShape
  * @version 0.1.0
  */

val scalaTest = Seq(
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)


lazy val commonSettings = Seq(
  organization := "au.edu.utscic",
  version := "0.1.0",
  scalaVersion in ThisBuild := "2.12.0"
)

lazy val textshape = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "TextShape",
    libraryDependencies ++= scalaTest
  )

scalacOptions in (Compile,doc) ++= Seq("-groups", "-implicits")