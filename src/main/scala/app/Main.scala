package app

import app.http.HttpRouter
import io.circe.generic.auto._
import io.circe.{Decoder, Encoder}
import org.http4s.Method._
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl
import org.http4s.dsl.impl._
import org.http4s.{EntityDecoder, EntityEncoder, HttpRoutes, Method}
import zio._
import zio.interop.catz._

object Main:

  def main(args: Array[String]): Unit =
    println("Hello world!")
    HttpRouter.routes
    println("I was compiled by dotty :)")
