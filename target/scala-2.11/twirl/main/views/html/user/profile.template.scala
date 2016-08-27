
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/dashboard("Your Profile")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<div id='user-profile'>
    <h5>User Profile</h5>
    <div><span class='field'>Username: </span><span>"""),_display_(/*7.54*/user/*7.58*/.getUsername()),format.raw/*7.72*/("""</span></div>
    <div><span class='field'>Account type: </span><span>guest</span></div>
    <div><span class='field'>Email: </span><span class='text'>"""),_display_(/*9.64*/user/*9.68*/.getEmail()),format.raw/*9.79*/("""</span><input class='input info' type='text' name='email'></div>
    <div><span class='field'>Name: </span><span class='text'>"""),_display_(/*10.63*/user/*10.67*/.getName()),format.raw/*10.77*/("""</span><input class='input info' type='text' name='name'></div>
    <div><span class='field'>Phone: </span><span class='text'>"""),_display_(/*11.64*/user/*11.68*/.getPhone()),format.raw/*11.79*/("""</span><input class='input info' type='text' name='phone'></div>
    <div><span class='field'>Address: </span><span class='text'>"""),_display_(/*12.66*/user/*12.70*/.getAddress()),format.raw/*12.83*/("""</span><input class='input info' type='text' name='address'></div>
    <div>
        <a class='blue-btn' id='edit'>Edit Profile</a>
        <a class='red-btn' id='pwd'>Change Password</a>
        <a class='blue-btn' id='save'>Save</a>
    </div>
    
    <span id='pass'>
        <div><span class='field'>Old Password: </span><input class='input pass' type='password' name='oldPass'></div>
        <div><span class='field'>New Password: </span><input class='input pass' type='password' name='newPass'></div>
        <div><span id='pass-status'></span></div>
        <div><a class='red-btn' id='save-pass'>Save</a></div>
    </span>
    
<script>
    //make fields editable
    $("#edit").click(function() """),format.raw/*28.33*/("""{"""),format.raw/*28.34*/("""
        """),format.raw/*29.9*/("""$("#edit, #pwd, .text").hide();
        $(".info").show();
        $("#save").addClass("show");
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/(""");
    
    //send update profile request to the server
    $("#save").click(function() """),format.raw/*35.33*/("""{"""),format.raw/*35.34*/("""
        """),format.raw/*36.9*/("""var req = """),format.raw/*36.19*/("""{"""),format.raw/*36.20*/("""}"""),format.raw/*36.21*/(""";
        $(".info").map(function() """),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""
            """),format.raw/*38.13*/("""req[$(this).attr("name")] = $(this).val();
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/(""");
        $.ajax("""),format.raw/*40.16*/("""{"""),format.raw/*40.17*/("""
            """),format.raw/*41.13*/("""url: '/profile',
            type: "PUT",
            data: req,
            success: function(data, status) """),format.raw/*44.45*/("""{"""),format.raw/*44.46*/("""
                """),format.raw/*45.17*/("""location.reload();
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/(""",
            error: function() """),format.raw/*47.31*/("""{"""),format.raw/*47.32*/("""
                """),format.raw/*48.17*/("""console.log("Error occurs. Please try again.")
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/(""");
        $(".info").hide();
        $("#save").removeClass("show");
        $("#edit, #pwd, .text").show();
    """),format.raw/*54.5*/("""}"""),format.raw/*54.6*/(""");
    
    //toggle change password option
    $('#pwd').click(function() """),format.raw/*57.32*/("""{"""),format.raw/*57.33*/("""
        """),format.raw/*58.9*/("""$("#pass").toggle();
        $("#pass input").val("");
        $('#pass-status').text("");
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/(""");
    
    //send password change request to the server
    $('#save-pass').click(function() """),format.raw/*64.38*/("""{"""),format.raw/*64.39*/("""
        """),format.raw/*65.9*/("""var req = """),format.raw/*65.19*/("""{"""),format.raw/*65.20*/("""}"""),format.raw/*65.21*/(""";
        $(".pass").map(function() """),format.raw/*66.35*/("""{"""),format.raw/*66.36*/("""
            """),format.raw/*67.13*/("""req[$(this).attr("name")] = $(this).val();
        """),format.raw/*68.9*/("""}"""),format.raw/*68.10*/(""");
        $.ajax("""),format.raw/*69.16*/("""{"""),format.raw/*69.17*/("""
            """),format.raw/*70.13*/("""url: '/profile/changepass',
            type: "PUT",
            data: req,
            success: function(data, status) """),format.raw/*73.45*/("""{"""),format.raw/*73.46*/("""
                """),format.raw/*74.17*/("""$('#pass-status').text(data);
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/(""",
            error: function() """),format.raw/*76.31*/("""{"""),format.raw/*76.32*/("""
                """),format.raw/*77.17*/("""console.log("Error occurs. Please try again.")
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""");
</script>
    
</div>

""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/user/profile.scala.html
                  HASH: 2c8648ae27cf7c53f7e234adc71fb28662cad8e0
                  MATRIX: 752->1|859->13|887->16|920->41|959->43|987->45|1116->148|1128->152|1162->166|1340->318|1352->322|1383->333|1537->460|1550->464|1581->474|1735->601|1748->605|1780->616|1937->746|1950->750|1984->763|2717->1468|2746->1469|2782->1478|2909->1578|2937->1579|3053->1667|3082->1668|3118->1677|3156->1687|3185->1688|3214->1689|3278->1725|3307->1726|3348->1739|3426->1790|3455->1791|3501->1809|3530->1810|3571->1823|3708->1932|3737->1933|3782->1950|3841->1981|3870->1982|3930->2014|3959->2015|4004->2032|4091->2091|4120->2092|4156->2101|4185->2102|4326->2216|4354->2217|4457->2292|4486->2293|4522->2302|4644->2397|4672->2398|4794->2492|4823->2493|4859->2502|4897->2512|4926->2513|4955->2514|5019->2550|5048->2551|5089->2564|5167->2615|5196->2616|5242->2634|5271->2635|5312->2648|5460->2768|5489->2769|5534->2786|5604->2828|5633->2829|5693->2861|5722->2862|5767->2879|5854->2938|5883->2939|5919->2948|5948->2949|5982->2956|6010->2957
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|59->28|59->28|60->29|63->32|63->32|66->35|66->35|67->36|67->36|67->36|67->36|68->37|68->37|69->38|70->39|70->39|71->40|71->40|72->41|75->44|75->44|76->45|77->46|77->46|78->47|78->47|79->48|80->49|80->49|81->50|81->50|85->54|85->54|88->57|88->57|89->58|92->61|92->61|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|98->67|99->68|99->68|100->69|100->69|101->70|104->73|104->73|105->74|106->75|106->75|107->76|107->76|108->77|109->78|109->78|110->79|110->79|111->80|111->80
                  -- GENERATED --
              */
          