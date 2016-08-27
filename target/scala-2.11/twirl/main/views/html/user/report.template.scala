
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object report_Scope0 {
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

class report extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Transaction],Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(transactions: List[Transaction])(total: Double):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""

"""),_display_(/*3.2*/dashboard("View Financial Report")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.5*/("""<div id='financial-report'>
        """),_display_(/*6.10*/for(entry <- transactions) yield /*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
            """),format.raw/*7.13*/("""<div>
                <span class='left-col'>#"""),_display_(/*8.42*/entry/*8.47*/.getTransactionId()),format.raw/*8.66*/(""" """),format.raw/*8.67*/("""&nbsp; 
                    Customer: """),_display_(/*9.32*/entry/*9.37*/.getCustomerId()),format.raw/*9.53*/("""</span>
                <span>$"""),_display_(/*10.25*/entry/*10.30*/.getTotal()),format.raw/*10.41*/("""</span>
            </div>
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""<div id='report-total'></div>

        <script>
            $('#report-total').text('Total: $' + Math.round("""),_display_(/*16.62*/total),format.raw/*16.67*/(""" """),format.raw/*16.68*/("""* 100) / 100);
        </script>
    </div>

""")))}))
      }
    }
  }

  def render(transactions:List[Transaction],total:Double): play.twirl.api.HtmlFormat.Appendable = apply(transactions)(total)

  def f:((List[Transaction]) => (Double) => play.twirl.api.HtmlFormat.Appendable) = (transactions) => (total) => apply(transactions)(total)

  def ref: this.type = this

}


}

/**/
object report extends report_Scope0.report
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/user/report.scala.html
                  HASH: cca7dcc8fa2595ece6ed717b7fc3a2315099e3b7
                  MATRIX: 770->1|913->49|941->52|983->86|1022->88|1054->94|1117->131|1158->157|1197->159|1237->172|1310->219|1323->224|1362->243|1390->244|1455->283|1468->288|1504->304|1563->336|1577->341|1609->352|1676->388|1712->397|1848->506|1874->511|1903->512
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|43->12|44->13|47->16|47->16|47->16
                  -- GENERATED --
              */
          