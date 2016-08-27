
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yixinsun/Desktop/yard-sale-helper/conf/routes
// @DATE:Tue Jul 26 21:51:26 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:4
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:41
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseTranController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def addTransaction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TranController.addTransaction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "transaction"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def removeFromCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.removeFromCart",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "cart/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:12
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:18
    def accounts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.accounts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts"})
        }
      """
    )
  
    // @LINE:16
    def addToCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addToCart",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:20
    def report: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.report",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "report"})
        }
      """
    )
  
    // @LINE:13
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editProfile",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:19
    def toggleStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.toggleStatus",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:14
    def changePass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.changePass",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/changepass"})
        }
      """
    )
  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:15
    def getCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:8
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:7
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:5
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:4
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseSaleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def getSaleImg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.getSaleImg",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/img/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:23
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.index",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:33
    def tag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.tag",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag"})
        }
      """
    )
  
    // @LINE:27
    def getItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.getItem",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:26
    def remove: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.remove",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "sale/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:28
    def getItemImg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.getItemImg",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item/img/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "sale"})
        }
      """
    )
  
    // @LINE:35
    def printTags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.printTags",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/sale/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def printTag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.printTag",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/item/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:30
    def editItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.editItem",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "item"})
        }
      """
    )
  
    // @LINE:29
    def addItem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SaleController.addItem",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item"})
        }
      """
    )
  
  }


}
