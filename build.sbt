lazy val root = project
  .in(file("."))
  .settings(
    name := "spark-salesforce",
    description :="Spark Salesforce Connector",
    version := "0.0.1",
    scalaVersion := "2.12.18",
  libraryDependencies ++= Seq(
      "com.force.api" % "force-wsc" % "58.0.0",
      "com.force.api" % "force-partner-api" % "58.0.0",
      "com.springml" % "salesforce-wave-api" % "1.0.10",
      "org.mockito" % "mockito-core" % "2.0.31-beta",
      "org.scalatest" %% "scalatest" % "3.0.3" % "test",
      "com.fasterxml.jackson.dataformat" % "jackson-dataformat-xml" % "2.4.4",
      "org.codehaus.woodstox" % "woodstox-core-asl" % "4.4.0",
      "org.apache.spark" %% "spark-core" % "3.4.1",
      "org.apache.spark" %% "spark-sql" % "3.4.1"
    )
  )

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"


//parallelExecution in Test := false
resolvers += Resolver.mavenLocal


resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += "sonatype-snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

// Spark Package Details (sbt-spark-package)
//spName := "springml/spark-salesforce"

//spAppendScalaVersion := true


pomExtra := (
  <url>https://github.com/springml/spark-salesforce</url>
    <licenses>
      <license>
        <name>Apache License, Verision 2.0</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <connection>scm:git:github.com/springml/spark-salesforce</connection>
      <developerConnection>scm:git:git@github.com:springml/spark-salesforce</developerConnection>
      <url>github.com/springml/spark-salesforce</url>
    </scm>
    <developers>
      <developer>
        <id>springml</id>
        <name>Springml</name>
        <url>http://www.springml.com</url>
      </developer>
    </developers>)


