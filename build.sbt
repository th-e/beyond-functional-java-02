organization := "de.webtuples"
name := "nel"
version := "1.0"

scalaVersion := "2.13.1"
// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html

lazy val scalaTestVersion = "3.2.0-M2"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.1.1",
  "org.scalatest" %% "scalatest-freespec" % scalaTestVersion % "test",
  "org.scalatest" %% "scalatest-mustmatchers" % scalaTestVersion % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.2" % "test"
)

testOptions in Test += Tests.Argument(
  TestFrameworks.ScalaCheck, "-maxSize", "5", "-minSuccessfulTests", "33",
  "-workers", s"${java.lang.Runtime.getRuntime.availableProcessors - 1}" ,
  "-verbosity", "1"
)