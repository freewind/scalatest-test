name := "scalatest-test"

scalaVersion := "2.10.1"

version := "1.0"

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases",
                "googlecode"      at "http://sass-java.googlecode.com/svn/repo"
                )

libraryDependencies += "org.scalatest"     %% "scalatest"           % "2.0.M5b" % "test"
