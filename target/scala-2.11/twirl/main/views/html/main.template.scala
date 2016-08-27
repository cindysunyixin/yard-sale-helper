
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template provides a basic layout and acts as a container for all other pages.
 * It takes two arguments, a `String` for the title of the page and an `Html`
 * block to insert into the DOM body.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    
    <head>
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("style/main.css")),format.raw/*14.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("img/favicon.png")),format.raw/*15.101*/("""">
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("js/jquery-2.2.4.min.js")),format.raw/*16.72*/("""" type="text/javascript"></script>
        <script src="https://use.fontawesome.com/2c268661a3.js"></script>
    </head>
    
    <body>
        <div id='mega-container'>"""),_display_(/*21.35*/content),format.raw/*21.42*/("""</div>
    </body>
    
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template provides a basic layout and acts as a container for all other pages.
 * It takes two arguments, a `String` for the title of the page and an `Html`
 * block to insert into the DOM body.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/main.scala.html
                  HASH: 8c119996098c630d3aee235cd44c74e8084b037b
                  MATRIX: 952->211|1077->241|1105->243|1197->308|1223->313|1312->375|1327->381|1383->416|1471->477|1486->483|1544->519|1596->544|1611->550|1675->593|1873->764|1901->771
                  LINES: 31->7|36->7|38->9|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|50->21|50->21
                  -- GENERATED --
              */
          