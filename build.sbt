name := "LearningPlay"

version := "1.0"

lazy val `learningplay` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(jdbc, ehcache, ws, specs2 % Test, guice)

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18"
)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")

      