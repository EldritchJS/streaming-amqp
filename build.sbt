name := "dstream-amqp"

organization := "com.redhat"

scalaVersion in ThisBuild := "2.11.7"

version := "0.0.1"

// **** from the sbt-spark-package plugin ****

spName := "com.redhat/dstream-amqp" // the name of your Spark Package

sparkVersion in ThisBuild := "2.0.0-SNAPSHOT" // the Spark Version your package depends on

sparkComponents in ThisBuild := Seq("streaming") // creates a dependency on spark-streaming

val vertexProton = "3.2.0"

libraryDependencies ++= Seq(
  "io.vertx" % "vertx-proton" % vertexProton,
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "org.apache.spark" %% "spark-core" % sparkVersion.value % "provided" classifier "tests"
)

// Remove this once Spark 2.0.0 is out
resolvers in ThisBuild += "apache-snapshots" at "https://repository.apache.org/snapshots/"
