
package views.html.tag

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tag_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class tag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/dashboard("Print tags")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<div id='print-tag'>
    <div>
        <div>Print tag for an item</div>
        <span>Item ID:</span><input type='text' class="input-short" id='itemId'>
        <a class='blue-btn' id='generateTagA'>Generate Tag</a>
    </div>
    <div>
        <div>Print tag for a catalog</div>
        <span>Sale ID:</span><input type='text' class="input-short" id='saleId'>
        <a class='blue-btn' id='generateTagB'>Generate Tag</a>
    </div>
</div>

<script>
    $('#generateTagA').click(function() """),format.raw/*17.41*/("""{"""),format.raw/*17.42*/("""
        """),format.raw/*18.9*/("""window.location.href = '/tag/item/' + $('#itemId').val();
    """),format.raw/*19.5*/("""}"""),format.raw/*19.6*/(""");
    $('#generateTagB').click(function() """),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""
        """),format.raw/*21.9*/("""window.location.href = '/tag/sale/' + $('#saleId').val();
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/(""");
</script>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object tag extends tag_Scope0.tag
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/tag/tag.scala.html
                  HASH: bd5f8fcb5564cc633069db001fc3b10de056e7c4
                  MATRIX: 827->1|858->24|897->26|925->28|1445->520|1474->521|1510->530|1599->592|1627->593|1698->636|1727->637|1763->646|1852->708|1880->709
                  LINES: 32->1|32->1|32->1|34->3|48->17|48->17|49->18|50->19|50->19|51->20|51->20|52->21|53->22|53->22
                  -- GENERATED --
              */
          