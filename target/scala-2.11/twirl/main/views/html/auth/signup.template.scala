
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupMsg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Guest Sign Up")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

    """),format.raw/*5.5*/("""<div class='auth-containers'>
               
        <form id='signup-form' method="post" action="/signup">
            <div>
                <span>USERNAME</span>
                <input type='text' name='username'>
            </div>

            <div>
                <span>PASSWORD</span>
                <input type='password' name='pwd'>
            </div>

            <div>
                <span>EMAIL</span>
                <input type='email' name='email'>
            </div>

            <div>
                <span>NAME</span>
                <input type='text' name='name'>
            </div>
            
            <div id='btns'>
                <a class='blue-btn' onclick="document.getElementById('signup-form').submit();">SIGN UP</a>
                <a class='red-btn' onclick="document.getElementById('signup-form').reset();">CLEAR</a>
            </div>
        </form>
        <span id='signupMsg'>"""),_display_(/*33.31*/signupMsg),format.raw/*33.40*/("""</span>
        
        <span>Already have an account? &nbsp; <a class='auth-link' href='/'>Log in!</a></span>
        
    </div>

""")))}))
      }
    }
  }

  def render(signupMsg:String): play.twirl.api.HtmlFormat.Appendable = apply(signupMsg)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (signupMsg) => apply(signupMsg)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/auth/signup.scala.html
                  HASH: c2ae211d52be9adb3c6f0d3278e3689953b40227
                  MATRIX: 752->1|866->20|894->23|923->44|962->46|994->52|1943->974|1973->983
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|64->33|64->33
                  -- GENERATED --
              */
          