package app.http

import app.Env
import zio.RIO
import org.http4s.dsl.Http4sDsl

type HttpTask[T] = RIO[Env, T]
object zioDsl extends Http4sDsl[HttpTask]

