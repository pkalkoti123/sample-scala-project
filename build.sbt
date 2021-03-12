name := "sample-scala-project"

version := "1.0"

scalaVersion := "2.13.5"

enablePlugins(JavaAppPackaging)
maintainer in Docker := "Prashant Kalkoti<prashantmkalkoti@gmail.com>"
packageSummary in Docker := "My first dockerized scala application"
dockerExposedPorts in Docker := Seq(8080)
dockerBaseImage in Docker := "openjdk:8"

libraryDependencies += "com.typesafe.akka" %% "akka-http"   % "10.1.12"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.26"


packageName in Docker := "gcp-trial-306603/" + name.value
dockerRepository := Some("gcr.io")