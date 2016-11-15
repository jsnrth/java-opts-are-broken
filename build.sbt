enablePlugins(DockerPlugin)

name := "java-opts-are-broken"

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

maintainer in Docker := "Jason <jasonmichaelroth@gmail.com>"

dockerExposedPorts := Seq(9000)
