package paperjs.Tools

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobal, JSImport}

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
trait Key extends js.Object

@js.native
@JSGlobal
object Key extends js.Object {
  def isDown(key: String): Boolean = js.native
}

@js.native
trait KeyEvent extends js.Object {
  val `type`: String = js.native
  val character: String = js.native
  val key: String = js.native
  override def toString: String = js.native
  def modifiers: js.Dynamic = js.native
}
