
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginMsg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("Log In to Yard Sale Helper")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.5*/("""<div class='auth-containers'>
        
        <h1>WELCOME TO YARD SALE HELPER, PLEASE LOG IN</h1>
        
        <form id='login-form' method="post" action="/login">
            <div>
                <span>USERNAME</span>
                <input type='text' name='username'>
            </div>
        
            <div>
                <span>PASSWORD</span>
                <input type='password' name='pwd'>
            </div>
        
            <div id='btns'>
                <a class='blue-btn' onclick="document.getElementById('login-form').submit();">LOG IN</a>
                <a class='red-btn' onclick="document.getElementById('login-form').reset();">CLEAR</a>
            </div>
        </form>
        <span id='loginMsg'>"""),_display_(/*25.30*/loginMsg),format.raw/*25.38*/("""</span>
        
        <span>Don't Have an Account yet? &nbsp; <a class='auth-link' href='/signup'>Sign Up Here!</a></span>
        
    </div>

""")))}))
      }
    }
  }

  def render(loginMsg:String): play.twirl.api.HtmlFormat.Appendable = apply(loginMsg)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (loginMsg) => apply(loginMsg)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/auth/login.scala.html
                  HASH: 7bec87184e24761bfc1c8251e67798b8d5fce13e
                  MATRIX: 750->1|863->19|891->22|933->56|972->58|1004->64|1770->803|1799->811
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|56->25|56->25
                  -- GENERATED --
              */
          