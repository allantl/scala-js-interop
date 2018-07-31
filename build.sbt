
lazy val root = (project in file("."))
  .settings(
    name := "scala-js-interop",
    version := "0.1",
    scalaVersion := "2.12.6",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "com.github.japgolly.scalajs-react" %%% "core" % "1.2.3",
      "org.scala-js" %%% "scalajs-dom" % "0.9.6"
    ),
    npmDependencies in Compile ++= Seq(
      "react" -> "16.4.1",
      "react-dom" -> "16.4.1",
      "@atlaskit/button" -> "9.0.4",
      "styled-components" -> "3.2.6"
    )
  )
  .enablePlugins(ScalaJSPlugin)
  .enablePlugins(ScalaJSBundlerPlugin)
