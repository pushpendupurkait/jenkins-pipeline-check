name := "jenkins-pipeline-check"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.0.1"
)

import sbtsonar.SonarPlugin.autoImport.sonarProperties
import sbtsonar.SonarPlugin.autoImport.sonarUseExternalConfig

sonarUseExternalConfig := true

sonarProperties ++= Map(
  "sonar.scoverage.reportPath" -> "target/scala-2.11/scoverage-report/scoverage.xml",
  "sonar.scala.scapegoat.reportPath" -> "target/scala-2.11/scapegoat-report/scapegoat.xml"
)
