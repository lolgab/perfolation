package perfolation

import scala.scalajs.js.Date

object Platform {
  val startOfYear: Date = new Date(new Date().getFullYear().toInt, 0, 0)

  def createDate(l: Long): CrossDate = new JavaScriptCrossDate(new Date(l.toDouble))
}