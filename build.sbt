name := "FuZzy Idea"

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "Maven Repository" at "http://repo1.maven.org/maven2/",
  "Sonatype snapshots repository" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.2-1",
  "org.webjars" % "angularjs" % "1.3.0-beta.2",
  "org.webjars" % "requirejs" % "2.1.11-1",
  "org.webjars" % "bootstrap" % "3.1.1-2"
)     

playJavaSettings 

pipelineStages := Seq(rjs, digest, gzip)