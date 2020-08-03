package app.api

import app.Env
import io.circe.{Codec, Decoder, Encoder}
import zio.RIO

case class User(name:String)
case class Message(usr: User, msg: String)

given as Codec[User] = Codec[User]
given as Codec[Message] = Codec[Message]
