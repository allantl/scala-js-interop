import japgolly.scalajs.react._
import scala.scalajs.js.annotation.JSImport
import scalajs.js

object Button {

  @JSImport("@atlaskit/button", JSImport.Default)
  @js.native
  object RawComponent extends js.Object

  val component = JsComponent[Null, Children.Varargs, Null](RawComponent)
}
