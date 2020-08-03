package app.api

import app.Env
import zio.RIO
import org.http4s.dsl.Http4sDsl

type ApiTask[T] = RIO[Env, T]

