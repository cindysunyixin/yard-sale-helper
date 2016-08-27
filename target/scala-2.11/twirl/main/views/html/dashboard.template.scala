
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
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

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template provides common components (e.g. nav bars)
 * for all user functionalities. Content will change based on which functionality
 * is currently chosen.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),_display_(/*9.2*/main(title)/*9.13*/ {_display_(Seq[Any](format.raw/*9.15*/("""

    """),format.raw/*11.5*/("""<div id='dashboard-container'>
       
        <div id='dashboard-nav'>
            <h2>MENU</h2>
            <ul>
                <li id='open-sale'><img src=""""),_display_(/*16.47*/routes/*16.53*/.Assets.versioned("img/new-sale.svg")),format.raw/*16.90*/("""">Open a Sale</li>
                <li onclick="window.location.href = '/user'"><img src=""""),_display_(/*17.73*/routes/*17.79*/.Assets.versioned("img/browse-sales.svg")),format.raw/*17.120*/("""">Browse Sales</li>
                <li onclick="window.location.href = '/profile'"><img src=""""),_display_(/*18.76*/routes/*18.82*/.Assets.versioned("img/setting.svg")),format.raw/*18.118*/("""">User Profile</li>
                <li onclick="window.location.href = '/tag'"><img src=""""),_display_(/*19.72*/routes/*19.78*/.Assets.versioned("img/tag.svg")),format.raw/*19.110*/("""">Print tags</li>
                """),_display_(/*20.18*/if(session.get("username") == "admin")/*20.56*/ {_display_(Seq[Any](format.raw/*20.58*/("""
                    """),format.raw/*21.21*/("""<li onclick="window.location.href = '/accounts'"><img src=""""),_display_(/*21.81*/routes/*21.87*/.Assets.versioned("img/admin.svg")),format.raw/*21.121*/("""">Manage Users</li>
                """)))}),format.raw/*22.18*/("""
                """),_display_(/*23.18*/if(session.get("username") == "bookkeeper")/*23.61*/ {_display_(Seq[Any](format.raw/*23.63*/("""
                    """),format.raw/*24.21*/("""<li onclick="window.location.href = '/report'"><img src=""""),_display_(/*24.79*/routes/*24.85*/.Assets.versioned("img/bookkeeper.svg")),format.raw/*24.124*/("""">Financial Report</li>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</ul>
        </div>
        
        <!-- hidden modal 1: open new sale -->
        <div class='modal' id='open-sale-modal'>
            <div class='modal-content' id='open-sale-content'>
                <div class='modal-img-upload'>
                    <div class='modal-img' id='sale-img'></div>
                    <div>
                        <input id="img-input-a" type="file" name='image' accept='.jpg, .png, .bmp' style='display: none'> 
                        <a onclick="document.getElementById('img-input-a').click();" class='blue-btn'>Upload Image</a>
                        <a id='create-sale'  class='red-btn'>Submit</a>
                        <span class='grey-btn' id='hide-modal-a'>Cancel</span>
                    </div>
                </div>
                <div id='create-sale-msg'></div>
                <div class='modal-text'><span class='label'>Title: </span><input type='text' name='title' class='sale-info'></div>
                <div class='modal-text'><span class='label'>Location: </span><input type='text' name='location' class='sale-info'></div>
            </div>
        </div>
        
        <!-- hidden modal 2: add catalog item -->
        <div class='modal' id='add-item-modal'>
            <div class='modal-content' id='add-item-content'>
                <div class='modal-img-upload'>
                    <div class='modal-img' id='item-img'></div>
                    <div>
                        <input id="img-input-b" type="file" name='image' accept='.jpg, .png, .bmp' style='display: none'> 
                        <a onclick="document.getElementById('img-input-b').click();" class='blue-btn'>Upload Image</a>
                        <a id='add-item'  class='red-btn'>Submit</a>
                        <span class='grey-btn' id='hide-modal-b'>Cancel</span>
                    </div>
                </div>
                <div id='add-item-msg'></div>
                <div class='modal-text'><span class='label'>Title: </span><input type='text' name='title' class='item-info'></div>
                <div class='modal-text'><span class='label'>Description: </span><input type='text' name='description' class='item-info'></div>
                <div class='modal-text'>
                    <span class='label short'>Price: </span><input type='text' name='price' class='item-info input-short'>
                    <span class='label short'>Stock: </span><input type='text' name='stock' class='item-info input-short'>
                </div>
            </div>
        </div>
        <div id='layer'></div>
        
        <div id='dashboard-main'>
            <div id='top-nav'>
                <span id='leftmost'>WELCOME TO YARD SALE HELPER</span>
                <span class='nav-option' onclick="window.location.href = '/logout'">LOG OUT</span>
                <span class='nav-option' onclick="window.location.href = '/cart'"><i class="fa fa-shopping-cart"></i></span>
                """),_display_(/*75.18*/if(session.isEmpty())/*75.39*/ {_display_(Seq[Any](format.raw/*75.41*/("""
                    """),format.raw/*76.21*/("""<span id='rightmost'>HELLO, PLEASE <a href='/'>LOG IN</a>.</span>
                """)))}/*77.19*/else/*77.24*/{_display_(Seq[Any](format.raw/*77.25*/("""
                    """),format.raw/*78.21*/("""<span id='rightmost'>"""),_display_(/*78.43*/session/*78.50*/.get("name")),format.raw/*78.62*/("""</span>
                """)))}),format.raw/*79.18*/("""
            """),format.raw/*80.13*/("""</div>
            <div>"""),_display_(/*81.19*/content),format.raw/*81.26*/("""</div>
        </div>
        
    </div>
    
    <script>
        
        //show and hide the add sale modal
        $("#open-sale").click(function() """),format.raw/*89.42*/("""{"""),format.raw/*89.43*/("""
            """),format.raw/*90.13*/("""$("#open-sale-modal").addClass("show");
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/(""");
        $('#hide-modal-a').click(function() """),format.raw/*92.45*/("""{"""),format.raw/*92.46*/("""
            """),format.raw/*93.13*/("""$("#open-sale-modal").removeClass("show");
            $("#create-sale-msg").text("");
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
        
        //send add sale request to the server
        $("#create-sale").click(function() """),format.raw/*98.44*/("""{"""),format.raw/*98.45*/("""
            """),format.raw/*99.13*/("""var formData = new FormData();
            var inputFile = document.getElementById('img-input-a').files[0];
            formData.append('file', inputFile);
            $('.sale-info').map(function() """),format.raw/*102.44*/("""{"""),format.raw/*102.45*/("""
                """),format.raw/*103.17*/("""formData.append($(this).attr("name"), $(this).val());
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/(""");
            if (!formData.get('title').length || 
                !formData.get('location').length) """),format.raw/*106.51*/("""{"""),format.raw/*106.52*/("""
                """),format.raw/*107.17*/("""$("#create-sale-msg").text("Please enter title and location."); 
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/(""" """),format.raw/*108.15*/("""else $.ajax("""),format.raw/*108.27*/("""{"""),format.raw/*108.28*/("""
                """),format.raw/*109.17*/("""url: '/sale',
                type: "POST",
                contentType: false,
                data: formData,
                processData: false,
                success: function(data, status) """),format.raw/*114.49*/("""{"""),format.raw/*114.50*/("""
                    """),format.raw/*115.21*/("""$("#open-sale-modal").removeClass("show");
                    location.reload();
                """),format.raw/*117.17*/("""}"""),format.raw/*117.18*/(""",
                error: function() """),format.raw/*118.35*/("""{"""),format.raw/*118.36*/("""
                    """),format.raw/*119.21*/("""console.log("Error occurs. Please try again.")
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/("""
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/(""");
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/(""");
        
        //show image after uploading
        $("#img-input-a").change(function() """),format.raw/*125.45*/("""{"""),format.raw/*125.46*/("""
            """),format.raw/*126.13*/("""var file = document.getElementById("img-input-a").files[0];
            var reader = new FileReader();
            reader.onloadend = function() """),format.raw/*128.43*/("""{"""),format.raw/*128.44*/("""
                """),format.raw/*129.17*/("""$('#sale-img').css("background-image", "url(" + reader.result + ")");
            """),format.raw/*130.13*/("""}"""),format.raw/*130.14*/("""
            """),format.raw/*131.13*/("""if (file) reader.readAsDataURL(file);
            else return;
        """),format.raw/*133.9*/("""}"""),format.raw/*133.10*/(""");
    </script>
""")))}))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template provides common components (e.g. nav bars)
 * for all user functionalities. Content will change based on which functionality
 * is currently chosen.
 */
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/dashboard.scala.html
                  HASH: 448d3b567b46da72698f9e47563d63c18b4daddb
                  MATRIX: 926->175|1051->205|1079->208|1098->219|1137->221|1170->227|1358->388|1373->394|1431->431|1549->522|1564->528|1627->569|1749->664|1764->670|1822->706|1940->797|1955->803|2009->835|2071->870|2118->908|2158->910|2207->931|2294->991|2309->997|2365->1031|2433->1068|2478->1086|2530->1129|2570->1131|2619->1152|2704->1210|2719->1216|2780->1255|2852->1296|2893->1309|5867->4256|5897->4277|5937->4279|5986->4300|6088->4384|6101->4389|6140->4390|6189->4411|6238->4433|6254->4440|6287->4452|6343->4477|6384->4490|6436->4515|6464->4522|6645->4675|6674->4676|6715->4689|6790->4737|6819->4738|6894->4785|6923->4786|6964->4799|7086->4894|7115->4895|7244->4996|7273->4997|7314->5010|7542->5209|7572->5210|7618->5227|7713->5293|7743->5294|7875->5397|7905->5398|7951->5415|8057->5492|8087->5493|8117->5494|8158->5506|8188->5507|8234->5524|8459->5720|8489->5721|8539->5742|8666->5840|8696->5841|8761->5877|8791->5878|8841->5899|8933->5962|8963->5963|9005->5976|9035->5977|9074->5988|9104->5989|9226->6082|9256->6083|9298->6096|9472->6241|9502->6242|9548->6259|9659->6341|9689->6342|9731->6355|9830->6426|9860->6427
                  LINES: 31->7|36->7|38->9|38->9|38->9|40->11|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|50->21|51->22|52->23|52->23|52->23|53->24|53->24|53->24|53->24|54->25|55->26|104->75|104->75|104->75|105->76|106->77|106->77|106->77|107->78|107->78|107->78|107->78|108->79|109->80|110->81|110->81|118->89|118->89|119->90|120->91|120->91|121->92|121->92|122->93|124->95|124->95|127->98|127->98|128->99|131->102|131->102|132->103|133->104|133->104|135->106|135->106|136->107|137->108|137->108|137->108|137->108|137->108|138->109|143->114|143->114|144->115|146->117|146->117|147->118|147->118|148->119|149->120|149->120|150->121|150->121|151->122|151->122|154->125|154->125|155->126|157->128|157->128|158->129|159->130|159->130|160->131|162->133|162->133
                  -- GENERATED --
              */
          