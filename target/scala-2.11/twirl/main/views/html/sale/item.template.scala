
package views.html.sale

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object item_Scope0 {
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

class item extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Sale,Item,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sale: Sale)(entry: Item):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/dashboard("Item details")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<div class='item-detail-container'>
    <div>
        <div>
        """),_display_(/*8.10*/if(entry.getImage() != null)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""<div class='list-item-pic' style='background-image: url(/item/img/"""),_display_(/*9.80*/entry/*9.85*/.getItemId()),format.raw/*9.97*/(""")'></div>
        """)))}/*10.11*/else/*10.16*/{_display_(Seq[Any](format.raw/*10.17*/("""
            """),format.raw/*11.13*/("""<div class='list-item-img'>No Image Yet</div>
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""</div>
        <div class='list-item-description'>
            <div>
                <span class='list-item-title'>"""),_display_(/*16.48*/entry/*16.53*/.getTitle()),format.raw/*16.64*/("""</span>
                <a class='red-btn' href='/sale/"""),_display_(/*17.49*/sale/*17.53*/.getSaleId()),format.raw/*17.65*/("""'>Back</a>
            </div>
            <span>$"""),_display_(/*19.21*/entry/*19.26*/.getPrice()),format.raw/*19.37*/("""</span>
            <div>
                <span>"""),_display_(/*21.24*/entry/*21.29*/.getStock()),format.raw/*21.40*/(""" """),format.raw/*21.41*/("""left in stock</span>&nbsp;&nbsp;
                <span id='stock-msg'></span>
            </div>
            """),_display_(/*24.14*/if(sale.getSellerId().equals(session.get("username")))/*24.68*/ {_display_(Seq[Any](format.raw/*24.70*/("""
                """),format.raw/*25.17*/("""<div><div id='update-item' class='grey-btn'>Update Item</div></div>
            """)))}/*26.15*/else/*26.20*/{_display_(Seq[Any](format.raw/*26.21*/("""
                """),format.raw/*27.17*/("""<div><div id='add-to-cart' class='blue-btn'>Add to Cart</div></div>
            """)))}),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""</div>
    </div>
    <span>"""),_display_(/*31.12*/entry/*31.17*/.getDescription()),format.raw/*31.34*/("""</span>
</div>

<script>
    //show and hide the update catalog item modal
    $("#update-item").click(function() """),format.raw/*36.40*/("""{"""),format.raw/*36.41*/("""
        """),format.raw/*37.9*/("""$("#add-item-modal").addClass("show");
    """),format.raw/*38.5*/("""}"""),format.raw/*38.6*/(""");
    $('#hide-modal-b').click(function() """),format.raw/*39.41*/("""{"""),format.raw/*39.42*/("""
        """),format.raw/*40.9*/("""$("#add-item-modal").removeClass("show");
        $("#add-item-msg").text("");
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""");
    
    //send update catalog item request to the server
    $("#add-item").click(function() """),format.raw/*45.37*/("""{"""),format.raw/*45.38*/("""
        """),format.raw/*46.9*/("""var formData = new FormData($('img-input-b'));
        var inputFile = document.getElementById('img-input-b').files[0];
        formData.append('file', inputFile);
        $('.item-info').map(function() """),format.raw/*49.40*/("""{"""),format.raw/*49.41*/("""
            """),format.raw/*50.13*/("""formData.append($(this).attr("name"), $(this).val());
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""");
        formData.append("itemId", """),_display_(/*52.36*/entry/*52.41*/.getItemId()),format.raw/*52.53*/(""");
        if (!formData.get('title').length && 
            !formData.get('description').length && 
            !formData.get('price').length && 
            !formData.get('stock').length &&
            formData.get('file') == 'undefined') """),format.raw/*57.50*/("""{"""),format.raw/*57.51*/("""
            """),format.raw/*58.13*/("""$("#add-item-msg").text("No changes are made.");
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/(""" """),format.raw/*59.11*/("""else if ((formData.get('price').length && (isNaN(formData.get('price')) || 
            formData.get('price') <= 0)) || 
            (formData.get('stock').length && !Number.isInteger(parseInt(formData.get('stock')))) || 
            formData.get('stock') < 0) """),format.raw/*62.40*/("""{"""),format.raw/*62.41*/("""
            """),format.raw/*63.13*/("""$("#add-item-msg").text("Please enter valid price/stock.");
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/(""" """),format.raw/*64.11*/("""else $.ajax("""),format.raw/*64.23*/("""{"""),format.raw/*64.24*/("""
            """),format.raw/*65.13*/("""url: '/item',
            type: "PUT",
            contentType: false,
            data: formData,
            processData: false,
            success: function(data, status) """),format.raw/*70.45*/("""{"""),format.raw/*70.46*/("""
                """),format.raw/*71.17*/("""$("#add-item-modal").removeClass("show");
                location.reload();
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/(""",
            error: function() """),format.raw/*74.31*/("""{"""),format.raw/*74.32*/("""
                """),format.raw/*75.17*/("""console.log("Error occurs. Please try again.");
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""
        """),format.raw/*77.9*/("""}"""),format.raw/*77.10*/(""");
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/(""");
    
    //show image after uploading
    $("#img-input-b").change(function() """),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
        """),format.raw/*82.9*/("""var file = document.getElementById("img-input-b").files[0];
        var reader = new FileReader();
        reader.onloadend = function() """),format.raw/*84.39*/("""{"""),format.raw/*84.40*/("""
            """),format.raw/*85.13*/("""$('#item-img').css("background-image", "url(" + reader.result + ")");
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/("""
        """),format.raw/*87.9*/("""if (file) reader.readAsDataURL(file);
        else return;
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""");
    
    //add an item to cart
    $("#add-to-cart").click(function() """),format.raw/*92.40*/("""{"""),format.raw/*92.41*/("""
        """),format.raw/*93.9*/("""var req = """),format.raw/*93.19*/("""{"""),format.raw/*93.20*/("""}"""),format.raw/*93.21*/(""";
        req['item'] = """),_display_(/*94.24*/entry/*94.29*/.getItemId()),format.raw/*94.41*/(""";
        $.ajax("""),format.raw/*95.16*/("""{"""),format.raw/*95.17*/("""
            """),format.raw/*96.13*/("""url: '/cart',
            type: "POST",
            data: req,
            success: function(data, status) """),format.raw/*99.45*/("""{"""),format.raw/*99.46*/("""
                """),format.raw/*100.17*/("""$("#stock-msg").text(data);
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/(""",
            error: function() """),format.raw/*102.31*/("""{"""),format.raw/*102.32*/("""
                """),format.raw/*103.17*/("""console.log("Error occurs. Please try again.");
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""
        """),format.raw/*105.9*/("""}"""),format.raw/*105.10*/(""");
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/(""");
</script>
        
""")))}))
      }
    }
  }

  def render(sale:Sale,entry:Item): play.twirl.api.HtmlFormat.Appendable = apply(sale)(entry)

  def f:((Sale) => (Item) => play.twirl.api.HtmlFormat.Appendable) = (sale) => (entry) => apply(sale)(entry)

  def ref: this.type = this

}


}

/**/
object item extends item_Scope0.item
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/sale/item.scala.html
                  HASH: ea9e6e8642761eeaad5714c97089cd07d782f0fd
                  MATRIX: 751->1|871->26|899->29|932->54|971->56|999->58|1094->127|1130->155|1169->157|1209->170|1302->237|1315->242|1347->254|1385->274|1398->279|1437->280|1478->293|1564->348|1600->357|1743->473|1757->478|1789->489|1872->545|1885->549|1918->561|1995->611|2009->616|2041->627|2117->676|2131->681|2163->692|2192->693|2329->803|2392->857|2432->859|2477->876|2577->958|2590->963|2629->964|2674->981|2786->1062|2822->1071|2878->1100|2892->1105|2930->1122|3072->1236|3101->1237|3137->1246|3207->1289|3235->1290|3306->1333|3335->1334|3371->1343|3481->1426|3509->1427|3634->1524|3663->1525|3699->1534|3930->1737|3959->1738|4000->1751|4089->1813|4118->1814|4183->1852|4197->1857|4230->1869|4499->2110|4528->2111|4569->2124|4653->2181|4682->2182|4711->2183|5000->2444|5029->2445|5070->2458|5165->2526|5194->2527|5223->2528|5263->2540|5292->2541|5333->2554|5536->2729|5565->2730|5610->2747|5727->2836|5756->2837|5816->2869|5845->2870|5890->2887|5978->2947|6007->2948|6043->2957|6072->2958|6106->2965|6134->2966|6243->3047|6272->3048|6308->3057|6473->3194|6502->3195|6543->3208|6648->3286|6677->3287|6713->3296|6803->3359|6831->3360|6932->3433|6961->3434|6997->3443|7035->3453|7064->3454|7093->3455|7145->3480|7159->3485|7192->3497|7237->3514|7266->3515|7307->3528|7442->3635|7471->3636|7517->3653|7586->3693|7616->3694|7677->3726|7707->3727|7753->3744|7842->3804|7872->3805|7909->3814|7939->3815|7974->3822|8003->3823
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|52->21|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|59->28|60->29|62->31|62->31|62->31|67->36|67->36|68->37|69->38|69->38|70->39|70->39|71->40|73->42|73->42|76->45|76->45|77->46|80->49|80->49|81->50|82->51|82->51|83->52|83->52|83->52|88->57|88->57|89->58|90->59|90->59|90->59|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|96->65|101->70|101->70|102->71|104->73|104->73|105->74|105->74|106->75|107->76|107->76|108->77|108->77|109->78|109->78|112->81|112->81|113->82|115->84|115->84|116->85|117->86|117->86|118->87|120->89|120->89|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|127->96|130->99|130->99|131->100|132->101|132->101|133->102|133->102|134->103|135->104|135->104|136->105|136->105|137->106|137->106
                  -- GENERATED --
              */
          