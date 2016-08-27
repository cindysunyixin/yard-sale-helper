
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/yixinsun/Desktop/yard-sale-helper/conf/routes
// @DATE:Tue Jul 26 21:51:26 EDT 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTranController TranController = new controllers.ReverseTranController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthController AuthController = new controllers.ReverseAuthController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSaleController SaleController = new controllers.ReverseSaleController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTranController TranController = new controllers.javascript.ReverseTranController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthController AuthController = new controllers.javascript.ReverseAuthController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSaleController SaleController = new controllers.javascript.ReverseSaleController(RoutesPrefix.byNamePrefix());
  }

}
