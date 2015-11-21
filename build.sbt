name := "finch-petstore"

version := "0.0.0"

scalaVersion := "2.11.7"

resolvers += Resolver.sonatypeRepo("snapshots")

resolvers += "TM" at "http://maven.twttr.com"

Defaults.itSettings

lazy val `it-config-sbt-project` = project.in(file(".")).configs(IntegrationTest)

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.9.2-SNAPSHOT" changing(),
  "com.github.finagle" %% "finch-argonaut" % "0.9.2-SNAPSHOT" changing(),
  "io.argonaut" %% "argonaut" % "6.1",
  "com.github.finagle" %% "finch-test" % "0.9.2-SNAPSHOT" % "test,it" changing(),
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test,it",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test,it"
)
