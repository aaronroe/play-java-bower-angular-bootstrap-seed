name := "Play-Java-Bower-Angular-Bootstrap-Seed"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)

resolvers ++= Seq(
  "Maven Repository" at "http://repo1.maven.org/maven2/",
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

play.Project.playJavaSettings

libraryDependencies ++= Seq(
  "org.webjars" % "angularjs" % "1.3.0-beta.2",
  "org.webjars" % "requirejs" % "2.1.11-1"
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)

pipelineStages := Seq(rjs, digest, gzip)