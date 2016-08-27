
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yixinsun/Desktop/yard-sale-helper/conf/routes
// @DATE:Tue Jul 26 21:51:26 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:4
  AuthController_1: controllers.AuthController,
  // @LINE:11
  UserController_3: controllers.UserController,
  // @LINE:23
  SaleController_2: controllers.SaleController,
  // @LINE:38
  TranController_0: controllers.TranController,
  // @LINE:41
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:4
    AuthController_1: controllers.AuthController,
    // @LINE:11
    UserController_3: controllers.UserController,
    // @LINE:23
    SaleController_2: controllers.SaleController,
    // @LINE:38
    TranController_0: controllers.TranController,
    // @LINE:41
    Assets_4: controllers.Assets
  ) = this(errorHandler, AuthController_1, UserController_3, SaleController_2, TranController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AuthController_1, UserController_3, SaleController_2, TranController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AuthController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.AuthController.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.AuthController.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.AuthController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.AuthController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.UserController.profile"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.UserController.editProfile"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/changepass""", """controllers.UserController.changePass"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.UserController.getCart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.UserController.addToCart"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart/""" + "$" + """id<[^/]+>""", """controllers.UserController.removeFromCart(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts""", """controllers.UserController.accounts"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accounts/""" + "$" + """id<[^/]+>""", """controllers.UserController.toggleStatus(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """report""", """controllers.UserController.report"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>""", """controllers.SaleController.index(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/img/""" + "$" + """id<[^/]+>""", """controllers.SaleController.getSaleImg(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale""", """controllers.SaleController.add"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sale/""" + "$" + """id<[^/]+>""", """controllers.SaleController.remove(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item/""" + "$" + """id<[^/]+>""", """controllers.SaleController.getItem(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item/img/""" + "$" + """id<[^/]+>""", """controllers.SaleController.getItemImg(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item""", """controllers.SaleController.addItem"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """item""", """controllers.SaleController.editItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag""", """controllers.SaleController.tag"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag/item/""" + "$" + """id<[^/]+>""", """controllers.SaleController.printTag(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag/sale/""" + "$" + """id<[^/]+>""", """controllers.SaleController.printTags(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transaction""", """controllers.TranController.addTransaction"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:4
  private[this] lazy val controllers_AuthController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AuthController_index0_invoker = createInvoker(
    AuthController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "index",
      Nil,
      "GET",
      """ Authetication routes""",
      this.prefix + """"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_AuthController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_AuthController_authenticate1_invoker = createInvoker(
    AuthController_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_AuthController_signup2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AuthController_signup2_invoker = createInvoker(
    AuthController_1.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AuthController_register3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_AuthController_register3_invoker = createInvoker(
    AuthController_1.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AuthController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_AuthController_logout4_invoker = createInvoker(
    AuthController_1.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_index5_invoker = createInvoker(
    UserController_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """ User routes""",
      this.prefix + """user"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_profile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_UserController_profile6_invoker = createInvoker(
    UserController_3.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_editProfile7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_UserController_editProfile7_invoker = createInvoker(
    UserController_3.editProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editProfile",
      Nil,
      "PUT",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_changePass8_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/changepass")))
  )
  private[this] lazy val controllers_UserController_changePass8_invoker = createInvoker(
    UserController_3.changePass,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "changePass",
      Nil,
      "PUT",
      """""",
      this.prefix + """profile/changepass"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_getCart9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_UserController_getCart9_invoker = createInvoker(
    UserController_3.getCart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getCart",
      Nil,
      "GET",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_addToCart10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_UserController_addToCart10_invoker = createInvoker(
    UserController_3.addToCart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addToCart",
      Nil,
      "POST",
      """""",
      this.prefix + """cart"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_removeFromCart11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_removeFromCart11_invoker = createInvoker(
    UserController_3.removeFromCart(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "removeFromCart",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """cart/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_accounts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts")))
  )
  private[this] lazy val controllers_UserController_accounts12_invoker = createInvoker(
    UserController_3.accounts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "accounts",
      Nil,
      "GET",
      """""",
      this.prefix + """accounts"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_toggleStatus13_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accounts/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_toggleStatus13_invoker = createInvoker(
    UserController_3.toggleStatus(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "toggleStatus",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """accounts/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_report14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("report")))
  )
  private[this] lazy val controllers_UserController_report14_invoker = createInvoker(
    UserController_3.report,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "report",
      Nil,
      "GET",
      """""",
      this.prefix + """report"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_SaleController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_index15_invoker = createInvoker(
    SaleController_2.index(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "index",
      Seq(classOf[Integer]),
      "GET",
      """ Sale routes""",
      this.prefix + """sale/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_SaleController_getSaleImg16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/img/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_getSaleImg16_invoker = createInvoker(
    SaleController_2.getSaleImg(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "getSaleImg",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """sale/img/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_SaleController_add17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale")))
  )
  private[this] lazy val controllers_SaleController_add17_invoker = createInvoker(
    SaleController_2.add,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "add",
      Nil,
      "POST",
      """""",
      this.prefix + """sale"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SaleController_remove18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sale/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_remove18_invoker = createInvoker(
    SaleController_2.remove(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "remove",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """sale/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_SaleController_getItem19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_getItem19_invoker = createInvoker(
    SaleController_2.getItem(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "getItem",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """item/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SaleController_getItemImg20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item/img/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_getItemImg20_invoker = createInvoker(
    SaleController_2.getItemImg(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "getItemImg",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """item/img/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_SaleController_addItem21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item")))
  )
  private[this] lazy val controllers_SaleController_addItem21_invoker = createInvoker(
    SaleController_2.addItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "addItem",
      Nil,
      "POST",
      """""",
      this.prefix + """item"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SaleController_editItem22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("item")))
  )
  private[this] lazy val controllers_SaleController_editItem22_invoker = createInvoker(
    SaleController_2.editItem,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "editItem",
      Nil,
      "PUT",
      """""",
      this.prefix + """item"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_SaleController_tag23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag")))
  )
  private[this] lazy val controllers_SaleController_tag23_invoker = createInvoker(
    SaleController_2.tag,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "tag",
      Nil,
      "GET",
      """ Sale-related routes""",
      this.prefix + """tag"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_SaleController_printTag24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag/item/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_printTag24_invoker = createInvoker(
    SaleController_2.printTag(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "printTag",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """tag/item/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_SaleController_printTags25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag/sale/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SaleController_printTags25_invoker = createInvoker(
    SaleController_2.printTags(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SaleController",
      "printTags",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """tag/sale/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_TranController_addTransaction26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transaction")))
  )
  private[this] lazy val controllers_TranController_addTransaction26_invoker = createInvoker(
    TranController_0.addTransaction,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TranController",
      "addTransaction",
      Nil,
      "POST",
      """ Transaction route""",
      this.prefix + """transaction"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Assets_versioned27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned27_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:4
    case controllers_AuthController_index0_route(params) =>
      call { 
        controllers_AuthController_index0_invoker.call(AuthController_1.index)
      }
  
    // @LINE:5
    case controllers_AuthController_authenticate1_route(params) =>
      call { 
        controllers_AuthController_authenticate1_invoker.call(AuthController_1.authenticate)
      }
  
    // @LINE:6
    case controllers_AuthController_signup2_route(params) =>
      call { 
        controllers_AuthController_signup2_invoker.call(AuthController_1.signup)
      }
  
    // @LINE:7
    case controllers_AuthController_register3_route(params) =>
      call { 
        controllers_AuthController_register3_invoker.call(AuthController_1.register)
      }
  
    // @LINE:8
    case controllers_AuthController_logout4_route(params) =>
      call { 
        controllers_AuthController_logout4_invoker.call(AuthController_1.logout)
      }
  
    // @LINE:11
    case controllers_UserController_index5_route(params) =>
      call { 
        controllers_UserController_index5_invoker.call(UserController_3.index)
      }
  
    // @LINE:12
    case controllers_UserController_profile6_route(params) =>
      call { 
        controllers_UserController_profile6_invoker.call(UserController_3.profile)
      }
  
    // @LINE:13
    case controllers_UserController_editProfile7_route(params) =>
      call { 
        controllers_UserController_editProfile7_invoker.call(UserController_3.editProfile)
      }
  
    // @LINE:14
    case controllers_UserController_changePass8_route(params) =>
      call { 
        controllers_UserController_changePass8_invoker.call(UserController_3.changePass)
      }
  
    // @LINE:15
    case controllers_UserController_getCart9_route(params) =>
      call { 
        controllers_UserController_getCart9_invoker.call(UserController_3.getCart)
      }
  
    // @LINE:16
    case controllers_UserController_addToCart10_route(params) =>
      call { 
        controllers_UserController_addToCart10_invoker.call(UserController_3.addToCart)
      }
  
    // @LINE:17
    case controllers_UserController_removeFromCart11_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_removeFromCart11_invoker.call(UserController_3.removeFromCart(id))
      }
  
    // @LINE:18
    case controllers_UserController_accounts12_route(params) =>
      call { 
        controllers_UserController_accounts12_invoker.call(UserController_3.accounts)
      }
  
    // @LINE:19
    case controllers_UserController_toggleStatus13_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_toggleStatus13_invoker.call(UserController_3.toggleStatus(id))
      }
  
    // @LINE:20
    case controllers_UserController_report14_route(params) =>
      call { 
        controllers_UserController_report14_invoker.call(UserController_3.report)
      }
  
    // @LINE:23
    case controllers_SaleController_index15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_index15_invoker.call(SaleController_2.index(id))
      }
  
    // @LINE:24
    case controllers_SaleController_getSaleImg16_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_getSaleImg16_invoker.call(SaleController_2.getSaleImg(id))
      }
  
    // @LINE:25
    case controllers_SaleController_add17_route(params) =>
      call { 
        controllers_SaleController_add17_invoker.call(SaleController_2.add)
      }
  
    // @LINE:26
    case controllers_SaleController_remove18_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_remove18_invoker.call(SaleController_2.remove(id))
      }
  
    // @LINE:27
    case controllers_SaleController_getItem19_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_getItem19_invoker.call(SaleController_2.getItem(id))
      }
  
    // @LINE:28
    case controllers_SaleController_getItemImg20_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_getItemImg20_invoker.call(SaleController_2.getItemImg(id))
      }
  
    // @LINE:29
    case controllers_SaleController_addItem21_route(params) =>
      call { 
        controllers_SaleController_addItem21_invoker.call(SaleController_2.addItem)
      }
  
    // @LINE:30
    case controllers_SaleController_editItem22_route(params) =>
      call { 
        controllers_SaleController_editItem22_invoker.call(SaleController_2.editItem)
      }
  
    // @LINE:33
    case controllers_SaleController_tag23_route(params) =>
      call { 
        controllers_SaleController_tag23_invoker.call(SaleController_2.tag)
      }
  
    // @LINE:34
    case controllers_SaleController_printTag24_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_printTag24_invoker.call(SaleController_2.printTag(id))
      }
  
    // @LINE:35
    case controllers_SaleController_printTags25_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SaleController_printTags25_invoker.call(SaleController_2.printTags(id))
      }
  
    // @LINE:38
    case controllers_TranController_addTransaction26_route(params) =>
      call { 
        controllers_TranController_addTransaction26_invoker.call(TranController_0.addTransaction)
      }
  
    // @LINE:41
    case controllers_Assets_versioned27_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned27_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
