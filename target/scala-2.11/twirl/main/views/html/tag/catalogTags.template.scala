
package views.html.tag

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catalogTags_Scope0 {
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

class catalogTags extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(catalog: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/dashboard("Print Tag for the catalog")/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
    """),format.raw/*4.5*/("""<div class='tag-container'>
            <div class='tags' id="ctags">
                <a class='blue-btn print' onclick="printDiv('ctags')">Print</a>
                <a class='red-btn' href='/tag'>Back</a>
                <br><br>
                """),_display_(/*9.18*/for(item <- catalog) yield /*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
                """),format.raw/*10.17*/("""<div>
                    <span>#"""),_display_(/*11.29*/item/*11.33*/.getItemId()),format.raw/*11.45*/("""</span>
                    <span>"""),_display_(/*12.28*/item/*12.32*/.getTitle()),format.raw/*12.43*/("""</span>
                    <span>$"""),_display_(/*13.29*/item/*13.33*/.getPrice()),format.raw/*13.44*/("""</span>
                </div>
                <span>"""),_display_(/*15.24*/item/*15.28*/.getDescription()),format.raw/*15.45*/("""</span>
                """)))}),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""</div>
    </div>

    <script>
            function printDiv(ctags) """),format.raw/*21.38*/("""{"""),format.raw/*21.39*/("""
                """),format.raw/*22.17*/("""var printContents = document.getElementById(ctags).innerHTML;
                var originalContents = document.body.innerHTML;
                document.body.innerHTML = printContents;
                window.print();
                document.body.innerHTML = originalContents;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
    """),format.raw/*28.5*/("""</script>
""")))}))
      }
    }
  }

  def render(catalog:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(catalog)

  def f:((List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (catalog) => apply(catalog)

  def ref: this.type = this

}


}

/**/
object catalogTags extends catalogTags_Scope0.catalogTags
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/tag/catalogTags.scala.html
                  HASH: dc1dd81503927943da05fa1d0499e142061339a0
                  MATRIX: 765->1|881->22|909->25|955->63|994->65|1025->70|1299->318|1334->338|1373->340|1418->357|1479->391|1492->395|1525->407|1587->442|1600->446|1632->457|1695->493|1708->497|1740->508|1821->562|1834->566|1872->583|1928->608|1969->621|2066->690|2095->691|2140->708|2455->995|2484->996|2516->1001
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|46->15|46->15|47->16|48->17|52->21|52->21|53->22|58->27|58->27|59->28
                  -- GENERATED --
              */
          