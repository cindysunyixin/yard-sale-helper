
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object cart_Scope0 {
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

class cart extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Item],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(shoppingCart: List[Item]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/dashboard("View Cart")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<div id='cart'>
        
        """),_display_(/*6.10*/if(!shoppingCart.isEmpty())/*6.37*/ {_display_(Seq[Any](format.raw/*6.39*/("""
        
            """),format.raw/*8.13*/("""<!-- non-empty cart view -->
        
            <h2>SHOPPING CART</h2>
            <span id='instr'>Please select payment type and insert your card before proceeding.</span>
            <div id='nonempty-cart'>
                <div id='cart-list'>
                    """),_display_(/*14.22*/for((item, index) <- shoppingCart.zipWithIndex) yield /*14.69*/ {_display_(Seq[Any](format.raw/*14.71*/("""
                                 
                        """),format.raw/*16.25*/("""<div class='cart-item-container'>
                    
                            """),_display_(/*18.30*/if(item.getImage() != null)/*18.57*/ {_display_(Seq[Any](format.raw/*18.59*/("""
                                """),format.raw/*19.33*/("""<div class='cart-item-pic' style='background-image: url(/item/img/"""),_display_(/*19.100*/item/*19.104*/.getItemId()),format.raw/*19.116*/(""")'></div>
                            """)))}/*20.31*/else/*20.36*/{_display_(Seq[Any](format.raw/*20.37*/("""
                                """),format.raw/*21.33*/("""<div class='cart-item-img'><span>No Image Yet</span></div>
                            """)))}),format.raw/*22.30*/("""
                    
                            """),format.raw/*24.29*/("""<div class='cart-item-des'>
                                <div>
                                    <span class='cart-item-id'>#"""),_display_(/*26.66*/item/*26.70*/.getItemId()),format.raw/*26.82*/("""</span>
                                    <span>"""),_display_(/*27.44*/item/*27.48*/.getTitle()),format.raw/*27.59*/("""</span>
                                    <span class='cart-item-price'>$<span class='price-data'>"""),_display_(/*28.94*/item/*28.98*/.getPrice()),format.raw/*28.109*/("""</span></span>
                                </div>
                                <div>Stock: <span class='cart-item-stock'>"""),_display_(/*30.76*/item/*30.80*/.getStock()),format.raw/*30.91*/("""</span></div>
                                <div class='cart-item-q'>
                                    <span>Quantity: &nbsp;</span>
                                    <select name="q" class='quantity-input'>
                                        <option value="1">1</option> 
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                        <option value="8">8</option>
                                        <option value="9">9</option>
                                    </select>
                                    <span id='quantity-msg'></span>
                                </div>
                                <div><a class='cart-item-delete' id='cart-item-delete-"""),_display_(/*46.88*/index),format.raw/*46.93*/("""'>Delete</a></div>
                            </div>
                
                            <script>
                                //remove an item from cart
                                $('#cart-item-delete-"""),_display_(/*51.55*/index),format.raw/*51.60*/("""').click(function() """),format.raw/*51.80*/("""{"""),format.raw/*51.81*/("""
                                    """),format.raw/*52.37*/("""$.ajax("""),format.raw/*52.44*/("""{"""),format.raw/*52.45*/("""
                                        """),format.raw/*53.41*/("""url: '/cart/' + """),_display_(/*53.58*/item/*53.62*/.getItemId()),format.raw/*53.74*/(""",
                                        type: 'DELETE',
                                        success: function(data, status) """),format.raw/*55.73*/("""{"""),format.raw/*55.74*/("""
                                            """),format.raw/*56.45*/("""location.reload();
                                        """),format.raw/*57.41*/("""}"""),format.raw/*57.42*/(""",
                                        error: function() """),format.raw/*58.59*/("""{"""),format.raw/*58.60*/("""
                                            """),format.raw/*59.45*/("""console.log("Error occurs. Please try again.");
                                        """),format.raw/*60.41*/("""}"""),format.raw/*60.42*/("""
                                    """),format.raw/*61.37*/("""}"""),format.raw/*61.38*/(""");
                                """),format.raw/*62.33*/("""}"""),format.raw/*62.34*/(""");
                            </script>
                        </div>
                    """)))}),format.raw/*65.22*/("""
                """),format.raw/*66.17*/("""</div>

                <div id='cart-summary'>
                    <h5>SUMMARY</h5>
                    <div>
                        <hr><span>Subtotal: </span>
                        <span id='subtotal'></span><hr>
                    </div>
                    <span>Payment Type: </span>
                    <div id='payment-options'>
                        <div>
                            <input type="radio" name="type" value="Visa">
                            <img src='"""),_display_(/*78.40*/routes/*78.46*/.Assets.versioned("img/visa.png")),format.raw/*78.79*/("""'>
                        </div>
                        <div>
                            <input type="radio" name="type" value="MasterCard">
                            <img src='"""),_display_(/*82.40*/routes/*82.46*/.Assets.versioned("img/mastercard.png")),format.raw/*82.85*/("""'>
                        </div>
                        <div>
                            <input type="radio" name="type" value="Discover">
                            <img src='"""),_display_(/*86.40*/routes/*86.46*/.Assets.versioned("img/discover.png")),format.raw/*86.83*/("""'>
                        </div>
                    </div>

                    <a id='securepayment' class='red-btn'>Pay Now</a>
                </div>
        
                <script>
                    //calculate subtotal and update it when amounts change
                    $('#subtotal').text('$' + Math.round(subtotal() * 100) / 100);
                    function subtotal() """),format.raw/*96.41*/("""{"""),format.raw/*96.42*/("""
                        """),format.raw/*97.25*/("""var items = $('.cart-item-container');
                        var subtotal = 0;
                        for (var i = 0; i < items.length; i++) """),format.raw/*99.64*/("""{"""),format.raw/*99.65*/("""
                            """),format.raw/*100.29*/("""var $item = items[i];
                            subtotal += $('.price-data', $item).text() * $('.quantity-input', $item).val();
                        """),format.raw/*102.25*/("""}"""),format.raw/*102.26*/("""
                        """),format.raw/*103.25*/("""return subtotal;
                    """),format.raw/*104.21*/("""}"""),format.raw/*104.22*/("""
                    """),format.raw/*105.21*/("""$('.quantity-input').change(function() """),format.raw/*105.60*/("""{"""),format.raw/*105.61*/("""
                        """),format.raw/*106.25*/("""$('#subtotal').text('$' + Math.round(subtotal() * 100) / 100);
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/(""");
                    
                    //submit payment
                    $('#securepayment').click(function() """),format.raw/*110.58*/("""{"""),format.raw/*110.59*/("""
                        """),format.raw/*111.25*/("""if ($('input[name=type]:checked').length === 0) """),format.raw/*111.73*/("""{"""),format.raw/*111.74*/("""
                            """),format.raw/*112.29*/("""$('#instr').addClass('red');
                        """),format.raw/*113.25*/("""}"""),format.raw/*113.26*/(""" """),format.raw/*113.27*/("""else """),format.raw/*113.32*/("""{"""),format.raw/*113.33*/("""
                            
                            """),format.raw/*115.29*/("""//record items and respective quantities
                            var receipts = $('.receipt');
                            var items = $('.cart-item-container');
                            var cart = '';
                            for (var i = 0; i < receipts.length; i++) """),format.raw/*119.71*/("""{"""),format.raw/*119.72*/("""
                                """),format.raw/*120.33*/("""var $receipt = receipts[i];
                                var $item = items[i];
                                var key = $('.cart-item-id', $item).text().replace('#', '');
                                var value = $('.quantity-input', $item).val();
                                var stock = $('.cart-item-stock', $item).text();
                                if (value > stock) """),format.raw/*125.52*/("""{"""),format.raw/*125.53*/("""
                                    """),format.raw/*126.37*/("""$('#quantity-msg').text("Not enough item left in stock.");
                                    return;
                                """),format.raw/*128.33*/("""}"""),format.raw/*128.34*/("""
                                """),format.raw/*129.33*/("""cart += key + '=' + value + " ";
                            """),format.raw/*130.29*/("""}"""),format.raw/*130.30*/("""
                            
                            """),format.raw/*132.29*/("""//send HTTP request for the payment and show the receipt
                            var req = """),format.raw/*133.39*/("""{"""),format.raw/*133.40*/("""}"""),format.raw/*133.41*/(""";
                            req['total'] = Math.round(subtotal() * 100) / 100;
                            req['cart'] = cart.trim();
                            $.ajax("""),format.raw/*136.36*/("""{"""),format.raw/*136.37*/("""
                                """),format.raw/*137.33*/("""url: '/transaction',
                                type: 'POST',
                                data: req,
                                success: function(data, status) """),format.raw/*140.65*/("""{"""),format.raw/*140.66*/("""
                                    """),format.raw/*141.37*/("""for (var i = 0; i < receipts.length; i++) """),format.raw/*141.79*/("""{"""),format.raw/*141.80*/("""
                                        """),format.raw/*142.41*/("""var $receipt = receipts[i];
                                        var $item = items[i];
                                        $('.receipt-quantity', $receipt).text($('.quantity-input', $item).val());
                                        $('#receipt-total').text('Total: ' + Math.round(subtotal() * 100) / 100);
                                        $('#payment-type').text('Payment method: ' + $('input[name=type]:checked').val());
                                        $('#layer').show();
                                        $('#receipts').addClass('show');
                                    """),format.raw/*149.37*/("""}"""),format.raw/*149.38*/("""
                                """),format.raw/*150.33*/("""}"""),format.raw/*150.34*/(""",
                                error: function() """),format.raw/*151.51*/("""{"""),format.raw/*151.52*/("""
                                    """),format.raw/*152.37*/("""console.log('Error occurs. Please try again.');
                                """),format.raw/*153.33*/("""}"""),format.raw/*153.34*/("""
                            """),format.raw/*154.29*/("""}"""),format.raw/*154.30*/(""");
                        """),format.raw/*155.25*/("""}"""),format.raw/*155.26*/("""
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/(""");
                </script>
            </div>

        """)))}/*160.11*/else/*160.16*/{_display_(Seq[Any](format.raw/*160.17*/(""" """),format.raw/*160.18*/("""<!-- empty cart view -->
            <div id='empty-cart'>
                <span>Your cart is empty.</span>
                <a href='/user' class='red-btn'>See the Deals</a>
            </div>
        """)))}),format.raw/*165.10*/("""

    """),format.raw/*167.5*/("""</div>

    <!-- receipt, shown when transaction is completed -->
    <div id='receipts'>
        <a class='red-btn' href='/cart'>Back</a>
        <a class='blue-btn' onclick="printDiv('receipts')">Print</a>
        <a class="red-btn" onclick="email('receipts')">Email Receipt</a>
        <span>Receipt</span>
        """),_display_(/*175.10*/for(item <- shoppingCart) yield /*175.35*/ {_display_(Seq[Any](format.raw/*175.37*/("""
            """),format.raw/*176.13*/("""<div class='receipt'>
                <span class='receipt-id'>#"""),_display_(/*177.44*/item/*177.48*/.getItemId()),format.raw/*177.60*/("""</span>
                <span class='receipt-title'>"""),_display_(/*178.46*/item/*178.50*/.getTitle()),format.raw/*178.61*/("""</span>
                <span class='receipt-quantity'></span>
                <span>$"""),_display_(/*180.25*/item/*180.29*/.getPrice()),format.raw/*180.40*/("""</span>
            </div>
        """)))}),format.raw/*182.10*/("""
        """),format.raw/*183.9*/("""<span id='receipt-total'></span>
        <span id='payment-type'></span>
    </div>
    <script>
        function printDiv(receipts) """),format.raw/*187.37*/("""{"""),format.raw/*187.38*/("""
            """),format.raw/*188.13*/("""var printContents = document.getElementById(receipts).innerHTML;
            var originalContents = document.body.innerHTML;
            document.body.innerHTML = printContents;
            window.print();
            document.body.innerHTML = originalContents;
        """),format.raw/*193.9*/("""}"""),format.raw/*193.10*/("""
        """),format.raw/*194.9*/("""function email(receipts) """),format.raw/*194.34*/("""{"""),format.raw/*194.35*/("""
            """),format.raw/*195.13*/("""var emailContents = document.getElementById(receipts).innerHTML;
            var originalContents = document.body.innerHTML;
            var date = new Date();
            var dateOfSale = date.getDate();
            var monthOfSale = date.getMonth()+1;
            var yearOfSale = date.getFullYear();
            date = monthOfSale + '/' + dateOfSale + '/' + yearOfSale;
            document.body.innerHTML = emailContents;
            location.href = "mailto:?subject=Garage Sale Receipt for " + date +"&body=" + emailContents;
            document.body.innerHTML = originalContents;
        """),format.raw/*205.9*/("""}"""),format.raw/*205.10*/("""
    """),format.raw/*206.5*/("""</script>
""")))}))
      }
    }
  }

  def render(shoppingCart:List[Item]): play.twirl.api.HtmlFormat.Appendable = apply(shoppingCart)

  def f:((List[Item]) => play.twirl.api.HtmlFormat.Appendable) = (shoppingCart) => apply(shoppingCart)

  def ref: this.type = this

}


}

/**/
object cart extends cart_Scope0.cart
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 21:51:27 EDT 2016
                  SOURCE: /Users/yixinsun/Desktop/yard-sale-helper/app/views/user/cart.scala.html
                  HASH: 020922ec5c44fee5f4dc497d645f4fb4efffac23
                  MATRIX: 752->1|873->27|901->30|931->52|970->54|1001->59|1061->93|1096->120|1135->122|1184->144|1482->415|1545->462|1585->464|1672->523|1783->607|1819->634|1859->636|1920->669|2015->736|2029->740|2063->752|2121->792|2134->797|2173->798|2234->831|2353->919|2431->969|2589->1100|2602->1104|2635->1116|2713->1167|2726->1171|2758->1182|2886->1283|2899->1287|2932->1298|3088->1427|3101->1431|3133->1442|4237->2519|4263->2524|4511->2745|4537->2750|4585->2770|4614->2771|4679->2808|4714->2815|4743->2816|4812->2857|4856->2874|4869->2878|4902->2890|5060->3020|5089->3021|5162->3066|5249->3125|5278->3126|5366->3186|5395->3187|5468->3232|5584->3320|5613->3321|5678->3358|5707->3359|5770->3394|5799->3395|5923->3488|5968->3505|6479->3989|6494->3995|6548->4028|6758->4211|6773->4217|6833->4256|7041->4437|7056->4443|7114->4480|7529->4867|7558->4868|7611->4893|7783->5037|7812->5038|7870->5067|8053->5221|8083->5222|8137->5247|8203->5284|8233->5285|8283->5306|8351->5345|8381->5346|8435->5371|8547->5454|8577->5455|8724->5573|8754->5574|8808->5599|8885->5647|8915->5648|8973->5677|9055->5730|9085->5731|9115->5732|9149->5737|9179->5738|9266->5796|9574->6075|9604->6076|9666->6109|10081->6495|10111->6496|10177->6533|10341->6668|10371->6669|10433->6702|10523->6763|10553->6764|10640->6822|10764->6917|10794->6918|10824->6919|11024->7090|11054->7091|11116->7124|11319->7298|11349->7299|11415->7336|11486->7378|11516->7379|11586->7420|12225->8030|12255->8031|12317->8064|12347->8065|12428->8117|12458->8118|12524->8155|12633->8235|12663->8236|12721->8265|12751->8266|12807->8293|12837->8294|12887->8315|12917->8316|12995->8375|13009->8380|13049->8381|13079->8382|13313->8584|13347->8590|13694->8909|13736->8934|13777->8936|13819->8949|13912->9014|13926->9018|13960->9030|14041->9083|14055->9087|14088->9098|14203->9185|14217->9189|14250->9200|14318->9236|14355->9245|14517->9378|14547->9379|14589->9392|14887->9662|14917->9663|14954->9672|15008->9697|15038->9698|15080->9711|15703->10306|15733->10307|15766->10312
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|39->8|45->14|45->14|45->14|47->16|49->18|49->18|49->18|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|55->24|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|61->30|61->30|61->30|77->46|77->46|82->51|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|86->55|86->55|87->56|88->57|88->57|89->58|89->58|90->59|91->60|91->60|92->61|92->61|93->62|93->62|96->65|97->66|109->78|109->78|109->78|113->82|113->82|113->82|117->86|117->86|117->86|127->96|127->96|128->97|130->99|130->99|131->100|133->102|133->102|134->103|135->104|135->104|136->105|136->105|136->105|137->106|138->107|138->107|141->110|141->110|142->111|142->111|142->111|143->112|144->113|144->113|144->113|144->113|144->113|146->115|150->119|150->119|151->120|156->125|156->125|157->126|159->128|159->128|160->129|161->130|161->130|163->132|164->133|164->133|164->133|167->136|167->136|168->137|171->140|171->140|172->141|172->141|172->141|173->142|180->149|180->149|181->150|181->150|182->151|182->151|183->152|184->153|184->153|185->154|185->154|186->155|186->155|187->156|187->156|191->160|191->160|191->160|191->160|196->165|198->167|206->175|206->175|206->175|207->176|208->177|208->177|208->177|209->178|209->178|209->178|211->180|211->180|211->180|213->182|214->183|218->187|218->187|219->188|224->193|224->193|225->194|225->194|225->194|226->195|236->205|236->205|237->206
                  -- GENERATED --
              */
          