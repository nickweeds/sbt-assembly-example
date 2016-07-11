lazy val root = (project in file(".")).
  settings(
    name := "sbt-asm-test",
    organization := "com.example",
    version := "0.1",
    scalaVersion := "2.11.7",
    scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked"),
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7",
    mainClass in assembly := Some("main.Main")
  )
