val dottyVersion = "0.26.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "distributed-chat",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    scalacOptions ++= Seq(
      "-Ykind-projector",
      "-Xfatal-warnings"
    ),

    

    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.0-RC21-2",
      "org.http4s" %% "http4s-blaze-server" % "1.0.0-M3",
      "org.http4s" %% "http4s-circe" % "1.0.0-M3",
      "org.http4s" %% "http4s-dsl" % "1.0.0-M3",
      "dev.zio" %% "zio-interop-cats" % "2.1.4.0-RC17",
      "io.circe" %% "circe-generic" % "0.14.0-M1",
      "com.github.pureconfig" %% "pureconfig" % "0.13.0"
    ).map(_.withDottyCompat(scalaVersion.value))

)
