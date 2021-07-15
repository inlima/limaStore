<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>

                    <p>Review before checkout</p>
                </div>
            </div>
        </section>

        <section class="container" ng-app="cartApp">
            <div ng-controller = "cartCtrl" ng-init="initCartId(${cartId})">
                <div>
                    <a class="btn btn-danger pull-left" ng-click="clearCart()"><span
                            class="glyphicon glyphicon-remove-sign"></span>Clear Cart</a>
                    <a href="<spring:url value="/order/${cartId}"/>"
                       class="btn btn-success pull-right"><span class="glyphicon-shopping-cart glyphicon"></span> Check out
                    </a>
                </div>

                <table class="table table-hover">
                    <tr>
                        <th>Nome do Produto</th>
                        <th>Preço Único</th>
                        <th>Quantidade</th>
                        <th>Preço</th>
                        <th>Ação</th>
                    </tr>
                    <tr ng-repeat = "item in cart.cartItems">
                        <td>{{item.product.productName}}</td>
                        <td>{{item.product.productPrice}}</td>
                        <td><a href="#" ng-click="addToQuantity(item.product.productId)">
                            <span class="glyphicon glyphicon-plus"></span></a>
                            {{item.quantity}}
                            <a href="#" ng-click="subtractFromQuantity(item.product.productId)">
                                <span class="glyphicon glyphicon-minus"></span></a></td>
                        <td>{{item.totalPrice}}</td>
                        <td><a href="#" class="label label-primary" ng-click="saveItems(item.product.productId)">
                            <span class="glyphicon glyphicon-pushpin"></span>Salvar Item</a>
                            <a href="#" class="label label-danger" ng-click="removeFromCart(item.product.productId)">
                                <span class="glyphicon glyphicon-remove"></span>Remover Item</a></td>
                    </tr>
                    <tr>
                        <th></th>
                        <th></th>
                        <th>Sub Total</th>
                        <th>{{GrandTotal}}</th>
                        <th></th>
                    </tr>
                </table>

                <a href="<spring:url value="/" />" class="btn btn-default">Continuar Comprando</a>

                <h2>Saved Items</h2>

                <table class="table table-hover">
                    <tr>
                        <th>Produto</th>
                        <th>Preço</th>
                        <th>Ação</th>
                    </tr>
                    <tr ng-repeat = "item in cart.savedItems">
                        <td>{{item.product.productName}}</td>
                        <td>{{item.product.productPrice}}</td>
                        <td><a href="#" class="label label-primary" ng-click="addToCartFromSaved(item.product.productId)">
                            <span class="glyphicon glyphicon-shopping-cart"></span>Adicionar ao Carrinho</a>
                            <a href="#" class="label label-danger" ng-click="removeFromSave(item.product.productId)">
                                <span class="glyphicon glyphicon-remove"></span>Remover Item</a></td>
                    </tr>
                </table>
            </div>
        </section>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
<script src="<c:url value="/resources/js/controller.js" /> "></script>