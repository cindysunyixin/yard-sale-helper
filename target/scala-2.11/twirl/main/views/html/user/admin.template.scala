
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/dashboard("Manage Accounts")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
    """),format.raw/*4.5*/("""<div id='admin-view'>
        """),_display_(/*5.10*/for((user, index) <- users.zipWithIndex) yield /*5.50*/ {_display_(Seq[Any](format.raw/*5.52*/("""
            """),format.raw/*6.13*/("""<div>
                <span class='account-name'>"""),_display_(/*7.45*/user/*7.49*/.getUsername()),format.raw/*7.63*/("""</span>
                <span class='account-roles'>"""),_display_(/*8.46*/user/*8.50*/.getRoles()),format.raw/*8.61*/("""</span>
                """),_display_(/*9.18*/if(user.getLocked())/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
                    """),format.raw/*10.21*/("""<span>
                        <span class='account-status'>Locked</span>
                        <a class='red-btn update-status' id='update-status-"""),_display_(/*12.77*/index),format.raw/*12.82*/("""'>Unlock</a>
                    </span>
                """)))}/*14.19*/else/*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
                    """),format.raw/*15.21*/("""<span>
                        <span class='account-status'>Active</span>
                        <a class='blue-btn update-status' id='update-status-"""),_display_(/*17.78*/index),format.raw/*17.83*/("""'>Lock</a>
                    </span>
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
            <script>
                $('#update-status-"""),_display_(/*22.36*/index),format.raw/*22.41*/("""').click(function() """),format.raw/*22.61*/("""{"""),format.raw/*22.62*/("""
                    """),format.raw/*23.21*/("""$.ajax("""),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""
                        """),format.raw/*24.25*/("""url: '/accounts/"""),_display_(/*24.42*/user/*24.46*/.getUsername()),format.raw/*24.60*/("""',
                        type: 'PUT',
                        success: function(data, status) """),format.raw/*26.57*/("""{"""),format.raw/*26.58*/("""
                            """),format.raw/*27.29*/("""location.reload();
                        """),format.raw/*28.25*/("""}"""),format.raw/*28.26*/(""",
                        error: function() """),format.raw/*29.43*/("""{"""),format.raw/*29.44*/("""
                            """),format.raw/*30.29*/("""console.log("Error occurs. Please try again.");
                        """),format.raw/*31.25*/("""}"""),format.raw/*31.26*/("""
                    """),format.raw/*32.21*/("""}"""),format.raw/*32.22*/(""");
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""");
            </script>
        """)))}),format.raw/*35.10*/("""
    """),format.raw/*36.5*/("""</div>
""")))}))
      }
    }
  }

  def render(users:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/user/admin.scala.html
                  HASH: c2c68267af17931d90101cf8f99959fe0f52dac0
                  MATRIX: 754->1|868->20|896->23|932->51|971->53|1002->58|1059->89|1114->129|1153->131|1193->144|1269->194|1281->198|1315->212|1394->265|1406->269|1437->280|1488->305|1516->325|1555->327|1604->348|1781->498|1807->503|1884->562|1897->567|1936->568|1985->589|2163->740|2189->745|2276->801|2317->814|2407->877|2433->882|2481->902|2510->903|2559->924|2594->931|2623->932|2676->957|2720->974|2733->978|2768->992|2892->1088|2921->1089|2978->1118|3049->1161|3078->1162|3150->1206|3179->1207|3236->1236|3336->1308|3365->1309|3414->1330|3443->1331|3490->1350|3519->1351|3584->1385|3616->1390
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|43->12|43->12|45->14|45->14|45->14|46->15|48->17|48->17|50->19|51->20|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26|57->26|58->27|59->28|59->28|60->29|60->29|61->30|62->31|62->31|63->32|63->32|64->33|64->33|66->35|67->36
                  -- GENERATED --
              */
          