package app.http

import app.Env
import app.api.{User, given _ }
import cats.effect.IO
import org.http4s.{EntityDecoder, HttpRoutes, Response}
import org.http4s.Method.{DELETE, GET, POST}
import org.http4s.dsl.impl.{->, /, IntVar, Root}
import zio.{RIO, ZIO}
import zio.interop.catz._
import org.http4s.circe.CirceEntityCodec._

import scala.language.implicitConversions
import zioDsl._

object HttpRouter:

  def routes = HttpRoutes.of[HttpTask] {
    case GET -> Root / IntVar(id) => 
      Ok("received:"+id)
    case msg @ POST -> Root =>
      for
        usr <- msg.as[User]
        resp <-  Ok(usr)
      yield resp
  }

