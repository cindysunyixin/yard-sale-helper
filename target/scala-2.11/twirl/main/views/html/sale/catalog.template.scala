
package views.html.sale

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object catalog_Scope0 {
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

class catalog extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Sale,List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale)(items: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/dashboard("Browse catalog")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

"""),format.raw/*5.1*/("""<div class='listing'>
    
    <div>
        <h1>"""),_display_(/*8.14*/sale/*8.18*/.getTitle()),format.raw/*8.29*/("""</h1>
        <a href='/user' class='red-btn'>Back</a>
    </div>
        
    """),_display_(/*12.6*/if(sale.getSellerId().equals(session.get("username")))/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<span class='blue-btn' id='add-catalog-item'>Add Item</span>
    """)))}),format.raw/*14.6*/("""
    """),_display_(/*15.6*/if(sale.getAdminId().equals(session.get("username")))/*15.59*/ {_display_(Seq[Any](format.raw/*15.61*/("""
        """),format.raw/*16.9*/("""<span class='grey-btn' id='close-sale'>Close Sale</span>
    """)))}),format.raw/*17.6*/("""
    
    """),format.raw/*19.5*/("""<input type='text' id='search-item' placeholder="Search for an item ... ">
    
    <ul>
        """),_display_(/*22.10*/for(entry <- items) yield /*22.29*/ {_display_(Seq[Any](format.raw/*22.31*/("""
            """),format.raw/*23.13*/("""<li class='list-item-container' onclick="window.location.href = '/item/' + """),_display_(/*23.89*/entry/*23.94*/.getItemId()),format.raw/*23.106*/("""">
                """),_display_(/*24.18*/if(entry.getImage() != null)/*24.46*/ {_display_(Seq[Any](format.raw/*24.48*/("""
                    """),format.raw/*25.21*/("""<div class='list-item-pic' style='background-image: url(/item/img/"""),_display_(/*25.88*/entry/*25.93*/.getItemId()),format.raw/*25.105*/(""")'></div>
                """)))}/*26.19*/else/*26.24*/{_display_(Seq[Any](format.raw/*26.25*/("""
                    """),format.raw/*27.21*/("""<div class='list-item-img'>No Image Yet</div>
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""<div class='list-item-description'>
                    <span class='list-item-title'>"""),_display_(/*30.52*/entry/*30.57*/.getTitle()),format.raw/*30.68*/("""</span>
                    <span>$"""),_display_(/*31.29*/entry/*31.34*/.getPrice()),format.raw/*31.45*/("""</span>
                    <span>"""),_display_(/*32.28*/entry/*32.33*/.getDescription()),format.raw/*32.50*/("""</span>
                    <span>
                        <span>"""),_display_(/*34.32*/entry/*34.37*/.getStock()),format.raw/*34.48*/(""" """),format.raw/*34.49*/("""left in stock</span>
                        &nbsp;&nbsp;&nbsp;
                        <span>ID: """),_display_(/*36.36*/entry/*36.41*/.getItemId()),format.raw/*36.53*/("""</span>
                    </span>
                </div>
            </li>
        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</ul>

</div>

<div id='confirmation'>
    <span>Are you sure?</span>
    <div>
        <span class='red-btn' id='confirm-close'>Yes</span>
        <span class='grey-btn' id='dismiss'>No</span>
    </div>
</div>

<script>
    //show and hide the add catalog item modal
    $("#add-catalog-item").click(function() """),format.raw/*55.45*/("""{"""),format.raw/*55.46*/("""
        """),format.raw/*56.9*/("""$("#add-item-modal").addClass("show");
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""");
    $('#hide-modal-b').click(function() """),format.raw/*58.41*/("""{"""),format.raw/*58.42*/("""
        """),format.raw/*59.9*/("""$("#add-item-modal").removeClass("show");
        $("#add-item-msg").text("");
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/(""");
    
    //send add catalog item request to the server
    $("#add-item").click(function() """),format.raw/*64.37*/("""{"""),format.raw/*64.38*/("""
        """),format.raw/*65.9*/("""var formData = new FormData();
        var inputFile = document.getElementById('img-input-b').files[0];
        formData.append('file', inputFile);
        $('.item-info').map(function() """),format.raw/*68.40*/("""{"""),format.raw/*68.41*/("""
            """),format.raw/*69.13*/("""formData.append($(this).attr("name"), $(this).val());
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""");
        formData.append("saleId", """),_display_(/*71.36*/sale/*71.40*/.getSaleId()),format.raw/*71.52*/(""");
        if (!formData.get('title').length || 
            !formData.get('description').length || 
            !formData.get('price').length || 
            !formData.get('stock').length) """),format.raw/*75.44*/("""{"""),format.raw/*75.45*/("""
            """),format.raw/*76.13*/("""$("#add-item-msg").text("Please complete all the fields.");
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""" """),format.raw/*77.11*/("""else if (isNaN(formData.get('price')) || 
                 formData.get('price') < 0 || 
                 !Number.isInteger(parseInt(formData.get('stock'))) || 
                 formData.get('stock') < 0) """),format.raw/*80.45*/("""{"""),format.raw/*80.46*/("""
            """),format.raw/*81.13*/("""$("#add-item-msg").text("Please enter valid price/stock.");
        """),format.raw/*82.9*/("""}"""),format.raw/*82.10*/(""" """),format.raw/*82.11*/("""else $.ajax("""),format.raw/*82.23*/("""{"""),format.raw/*82.24*/("""
            """),format.raw/*83.13*/("""url: '/item',
            type: "POST",
            contentType: false,
            data: formData,
            processData: false,
            success: function(data, status) """),format.raw/*88.45*/("""{"""),format.raw/*88.46*/("""
                """),format.raw/*89.17*/("""$("#add-item-modal").removeClass("show");
                location.reload();
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/(""",
            error: function() """),format.raw/*92.31*/("""{"""),format.raw/*92.32*/("""
                """),format.raw/*93.17*/("""console.log("Error occurs. Please try again.")
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");
    
    //show image after uploading
    $("#img-input-b").change(function() """),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""
        """),format.raw/*100.9*/("""var file = document.getElementById("img-input-b").files[0];
        var reader = new FileReader();
        reader.onloadend = function() """),format.raw/*102.39*/("""{"""),format.raw/*102.40*/("""
            """),format.raw/*103.13*/("""$('#item-img').css("background-image", "url(" + reader.result + ")");
        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/("""
        """),format.raw/*105.9*/("""if (file) reader.readAsDataURL(file);
        else return;
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/(""");
    
    //implement search item
    $("#search-item").change(function() """),format.raw/*110.41*/("""{"""),format.raw/*110.42*/("""
        """),format.raw/*111.9*/("""var $content = $(this).val().toLowerCase();
        $(".list-item-container").each(function() """),format.raw/*112.51*/("""{"""),format.raw/*112.52*/("""
            """),format.raw/*113.13*/("""$(this).toggle(!$content.length || $(".list-item-title", this).text().toLowerCase().includes($content));
        """),format.raw/*114.9*/("""}"""),format.raw/*114.10*/(""");
    """),format.raw/*115.5*/("""}"""),format.raw/*115.6*/(""");
    
    //display/hide close sale confirmation modal
    $('#close-sale').click(function() """),format.raw/*118.39*/("""{"""),format.raw/*118.40*/("""
        """),format.raw/*119.9*/("""$('#layer').show();
        $('#confirmation').addClass('show');
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""");
    $('#dismiss').click(function() """),format.raw/*122.36*/("""{"""),format.raw/*122.37*/("""
        """),format.raw/*123.9*/("""$('#layer').hide();
        $('#confirmation').removeClass('show');        
    """),format.raw/*125.5*/("""}"""),format.raw/*125.6*/(""");
    
    //send close sale request to server
    $("#confirm-close").click(function() """),format.raw/*128.42*/("""{"""),format.raw/*128.43*/("""
        """),format.raw/*129.9*/("""$.ajax("""),format.raw/*129.16*/("""{"""),format.raw/*129.17*/("""
            """),format.raw/*130.13*/("""url: '/sale/"""),_display_(/*130.26*/sale/*130.30*/.getSaleId()),format.raw/*130.42*/("""',
            type: 'DELETE',
            success: function(data, status) """),format.raw/*132.45*/("""{"""),format.raw/*132.46*/("""
                """),format.raw/*133.17*/("""window.location.href = '/user';
            """),format.raw/*134.13*/("""}"""),format.raw/*134.14*/(""",
            error: function() """),format.raw/*135.31*/("""{"""),format.raw/*135.32*/("""
                """),format.raw/*136.17*/("""console.log("Error occurs. Please try again.");
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/("""
        """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/(""");
    """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/(""");
</script>

""")))}))
      }
    }
  }

  def render(sale:Sale,items:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(sale)(items)

  def f:((Sale) => (List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (sale) => (items) => apply(sale)(items)

  def ref: this.type = this

}


}

/**/
object catalog extends catalog_Scope0.catalog
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/sale/catalog.scala.html
                  HASH: e31566a96ef6d68721417ae26167b4fe6e4dd084
                  MATRIX: 763->1|889->32|917->35|952->62|991->64|1019->66|1095->116|1107->120|1138->131|1244->211|1307->265|1347->267|1383->276|1479->342|1511->348|1573->401|1613->403|1649->412|1741->474|1778->484|1903->582|1938->601|1978->603|2019->616|2122->692|2136->697|2170->709|2217->729|2254->757|2294->759|2343->780|2437->847|2451->852|2485->864|2531->892|2544->897|2583->898|2632->919|2726->982|2771->999|2885->1086|2899->1091|2931->1102|2994->1138|3008->1143|3040->1154|3102->1189|3116->1194|3154->1211|3247->1277|3261->1282|3293->1293|3322->1294|3448->1393|3462->1398|3495->1410|3612->1496|3644->1501|3985->1814|4014->1815|4050->1824|4120->1867|4148->1868|4219->1911|4248->1912|4284->1921|4394->2004|4422->2005|4544->2099|4573->2100|4609->2109|4824->2296|4853->2297|4894->2310|4983->2372|5012->2373|5077->2411|5090->2415|5123->2427|5341->2617|5370->2618|5411->2631|5506->2699|5535->2700|5564->2701|5797->2906|5826->2907|5867->2920|5962->2988|5991->2989|6020->2990|6060->3002|6089->3003|6130->3016|6334->3192|6363->3193|6408->3210|6525->3299|6554->3300|6614->3332|6643->3333|6688->3350|6775->3409|6804->3410|6840->3419|6869->3420|6903->3427|6931->3428|7040->3509|7069->3510|7106->3519|7272->3656|7302->3657|7344->3670|7450->3748|7480->3749|7517->3758|7608->3821|7637->3822|7742->3898|7772->3899|7809->3908|7932->4002|7962->4003|8004->4016|8145->4129|8175->4130|8210->4137|8239->4138|8363->4233|8393->4234|8430->4243|8527->4312|8556->4313|8623->4351|8653->4352|8690->4361|8798->4441|8827->4442|8945->4531|8975->4532|9012->4541|9048->4548|9078->4549|9120->4562|9161->4575|9175->4579|9209->4591|9313->4666|9343->4667|9389->4684|9462->4728|9492->4729|9553->4761|9583->4762|9629->4779|9718->4839|9748->4840|9785->4849|9815->4850|9850->4857|9879->4858
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|50->19|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|65->34|65->34|65->34|67->36|67->36|67->36|71->40|72->41|86->55|86->55|87->56|88->57|88->57|89->58|89->58|90->59|92->61|92->61|95->64|95->64|96->65|99->68|99->68|100->69|101->70|101->70|102->71|102->71|102->71|106->75|106->75|107->76|108->77|108->77|108->77|111->80|111->80|112->81|113->82|113->82|113->82|113->82|113->82|114->83|119->88|119->88|120->89|122->91|122->91|123->92|123->92|124->93|125->94|125->94|126->95|126->95|127->96|127->96|130->99|130->99|131->100|133->102|133->102|134->103|135->104|135->104|136->105|138->107|138->107|141->110|141->110|142->111|143->112|143->112|144->113|145->114|145->114|146->115|146->115|149->118|149->118|150->119|152->121|152->121|153->122|153->122|154->123|156->125|156->125|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|161->130|163->132|163->132|164->133|165->134|165->134|166->135|166->135|167->136|168->137|168->137|169->138|169->138|170->139|170->139
                  -- GENERATED --
              */
          