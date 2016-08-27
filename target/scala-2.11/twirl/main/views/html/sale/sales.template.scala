
package views.html.sale

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sales_Scope0 {
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

class sales extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Sale],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sales: List[Sale]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/dashboard("Browse sales")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<div class='listing'>
    
    <h1>BROWSE ONGOING SALES</h1>
    
    <ul>
        """),_display_(/*10.10*/for(listing <- sales) yield /*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/("""
            """),format.raw/*11.13*/("""<li class='list-item-container' onclick="window.location.href = '/sale/' + """),_display_(/*11.89*/listing/*11.96*/.getSaleId()),format.raw/*11.108*/("""">
                """),_display_(/*12.18*/if(listing.getImage() != null)/*12.48*/ {_display_(Seq[Any](format.raw/*12.50*/("""
                    """),format.raw/*13.21*/("""<div class='list-item-pic' style='background-image: url(/sale/img/"""),_display_(/*13.88*/listing/*13.95*/.getSaleId()),format.raw/*13.107*/(""")'></div>
                """)))}/*14.19*/else/*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
                    """),format.raw/*15.21*/("""<div class='list-item-img'>No Image Yet</div>
                """)))}),format.raw/*16.18*/("""
                """),format.raw/*17.17*/("""<div class='list-item-description'>
                    <span class='list-item-title'>"""),_display_(/*18.52*/listing/*18.59*/.getTitle()),format.raw/*18.70*/("""</span>
                    <span>"""),_display_(/*19.28*/listing/*19.35*/.getLocation()),format.raw/*19.49*/("""</span>
                    <span>
                        <span>Seller: """),_display_(/*21.40*/listing/*21.47*/.getSellerId()),format.raw/*21.61*/("""</span>
                        &nbsp;&nbsp;&nbsp;
                        <span>ID: """),_display_(/*23.36*/listing/*23.43*/.getSaleId()),format.raw/*23.55*/("""</span>
                    </span>
                    <span>Remaining Items: """),_display_(/*25.45*/listing/*25.52*/.getSize()),format.raw/*25.62*/("""</span>
                </div>
            </li>
        """)))}),format.raw/*28.10*/("""
    """),format.raw/*29.5*/("""</ul>

</div>

""")))}))
      }
    }
  }

  def render(sales:List[Sale]): play.twirl.api.HtmlFormat.Appendable = apply(sales)

  def f:((List[Sale]) => play.twirl.api.HtmlFormat.Appendable) = (sales) => apply(sales)

  def ref: this.type = this

}


}

/**/
object sales extends sales_Scope0.sales
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/sale/sales.scala.html
                  HASH: c088f736b7dc32421a9be01f2d6b75c9040bfea8
                  MATRIX: 754->1|868->20|896->23|929->48|968->50|996->52|1107->136|1144->157|1184->159|1225->172|1328->248|1344->255|1378->267|1425->287|1464->317|1504->319|1553->340|1647->407|1663->414|1697->426|1743->454|1756->459|1795->460|1844->481|1938->544|1983->561|2097->648|2113->655|2145->666|2207->701|2223->708|2258->722|2359->796|2375->803|2410->817|2523->903|2539->910|2572->922|2679->1002|2695->1009|2726->1019|2815->1077|2847->1082
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|41->10|41->10|41->10|42->11|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|56->25|56->25|56->25|59->28|60->29
                  -- GENERATED --
              */
          