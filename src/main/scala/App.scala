import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import dom.document

object App {
  def main(args: Array[String]): Unit = {
    val Main =
      ScalaComponent
        .builder[Unit]("Main")
        .stateless
        .render_(
          <.div(
            Button.component("Click Here")
          )
        )
        .build

    Main().renderIntoDOM(document.body)
  }
}
