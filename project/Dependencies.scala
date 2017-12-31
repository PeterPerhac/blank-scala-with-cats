import sbt._

object Dependencies {

  lazy val cats = Seq (
    "org.typelevel" %% "cats-core" % "1.0.1"
  )

  lazy val scalaTest = Seq(
    "org.scalactic" %% "scalactic" % "3.0.4",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )

}
