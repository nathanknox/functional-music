import mill._
import mill.scalalib._

object functionalmusic extends ScalaModule {

  def scalacOptions = Seq(
    "-Xfatal-warnings"
  )
  def scalaVersion  = "2.13.10"

  object test extends Tests with TestModule.Munit {
    def ivyDeps = Agg(
      ivy"org.scalameta::munit::0.7.29"
    )
  }
}
