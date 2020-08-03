package app.api

import fs2.Stream


object Chat {
  
  def join(user: User):Stream[ApiTask,Message] = ???
  
  def message(user: User, message: Message):ApiTask[Unit] = ???

}
