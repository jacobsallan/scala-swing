import VersionKeys._
import bintray.Keys._

organization := "org.scala-lang.modules"

name := "scala-swing"

version := "1.0.0-tmp"

scalaVersion := "2.11.0-M7"

snapshotScalaBinaryVersion := "2.11.0-M7"

// important!! must come here (why?)
osgiSettings

OsgiKeys.exportPackage := Seq(s"scala.swing.*;version=${version.value}")

licenses += ("BSD New", url("http://opensource.org/licenses/BSD-3-Clause"))

bintraySettings

// must come after bintraySettings, but does not work yet
// bintrayOrganization in bintray := Some("scala")

// must come after bintraySettings
repository in bintray := "scala-milestones"
