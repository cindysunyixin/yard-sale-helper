
package views.html.tag

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object itemTag_Scope0 {
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

class itemTag extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(item: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/dashboard("Print Tag for the Item")/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
    """),format.raw/*4.5*/("""<div class='tag-container'>
        <div class='tags' id="tags">
            <a class='blue-btn' onclick="tagsPrint('tags')">Print Tag</a>
            <a class='red-btn' href='/tag'>Back</a>
            <br><br>
            <div>
                <span>#"""),_display_(/*10.25*/item/*10.29*/.getItemId()),format.raw/*10.41*/("""</span>
                <span>"""),_display_(/*11.24*/item/*11.28*/.getTitle()),format.raw/*11.39*/("""</span>
                <span>$"""),_display_(/*12.25*/item/*12.29*/.getPrice()),format.raw/*12.40*/("""</span>
                <span>"""),_display_(/*13.24*/item/*13.28*/.getDescription()),format.raw/*13.45*/("""</span>
            </div>
        </div>
    </div>

    <script>
        function tagsPrint(tags) """),format.raw/*19.34*/("""{"""),format.raw/*19.35*/("""
            """),format.raw/*20.13*/("""var tagContents = document.getElementById(tags).innerHTML;
            var originalContents = document.body.innerHTML;
            document.body.innerHTML = tagContents;
            window.print();
            document.body.innerHTML = originalContents;
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/("""
    """),format.raw/*26.5*/("""</script>
""")))}))
      }
    }
  }

  def render(item:Item): play.twirl.api.HtmlFormat.Appendable = apply(item)

  def f:((Item) => play.twirl.api.HtmlFormat.Appendable) = (item) => apply(item)

  def ref: this.type = this

}


}

/**/
object itemTag extends itemTag_Scope0.itemTag
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/tag/itemTag.scala.html
                  HASH: d7a1c9fdabfc4675e2ad561b5052c1566f9dcfd2
                  MATRIX: 751->1|858->13|886->16|929->51|968->53|999->58|1280->312|1293->316|1326->328|1384->359|1397->363|1429->374|1488->406|1501->410|1533->421|1591->452|1604->456|1642->473|1770->573|1799->574|1840->587|2129->849|2158->850|2190->855
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|50->19|50->19|51->20|56->25|56->25|57->26
                  -- GENERATED --
              */
          