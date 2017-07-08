'use strict';

//-----Used to get all products------------------------

app.controller('ProductCtrl', function($scope, $http){
	
	$http.get("http://localhost:8080/expenceweb/allproducts").then(function(response){
		$scope.getAllProd = response.data;
	});
	
});

//--------Product Detail controller----------------------

app.controller('ProductDetailCtrl', function($scope,$http,$routeParams){
	
	
	$http.get("http://localhost:8080/expenceweb/product/" +$routeParams.pid).then(function(response){
		$scope.prodDetails = response.data;
	});
	
	
	
	
});
