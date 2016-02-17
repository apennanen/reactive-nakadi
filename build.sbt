name := """reactive-nakadi"""
organization := "de.zalando"

version := "0.1.0-SNAPSHOT"
scalaVersion := "2.11.7"

val akkaVersion = "2.4.1"
val akkaExperimentalVersion = "2.0.3"

resolvers += "Maven Central Server" at "http://repo1.maven.org/maven2"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.3",
  "org.scalaz" %% "scalaz-core" % "7.1.6",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaExperimentalVersion,
  "com.typesafe.akka" %% "akka-stream-experimental" % akkaExperimentalVersion
)

mainClass in assembly := Some("de.zalando.react.nakadi.TestApp")
