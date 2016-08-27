
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yixinsun/Desktop/yard-sale-helper/conf/routes
// @DATE:Tue Jul 26 21:51:26 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
