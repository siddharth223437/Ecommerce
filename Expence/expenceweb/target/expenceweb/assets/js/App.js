
var app = angular.module('myApp', ['ngRoute']);

app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	$routeProvider
		.when("/",{
			templateUrl: "ProductList.jsp",
			controller : "ProductCtrl"
		})
		.when("/product/:pid",{
			templateUrl: "ProductDetails.jsp",
			controller : "ProductDetailCtrl"
		})
		.otherwise({
			templateUrl: "ProductList.jsp"
		});
	
}]);