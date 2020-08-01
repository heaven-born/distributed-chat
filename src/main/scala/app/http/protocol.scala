package app.http

import app.Env
import io.circe.{Decoder, Encoder}
import zio.RIO

case class User(name:String)
case class Message(usr: User, msg: String)

given as Decoder[User] = Decoder[User]
given as Encoder[User] = Encoder[User]
given as Decoder[Message] = Decoder[Message]
given as Encoder[Message] = Encoder[Message]

