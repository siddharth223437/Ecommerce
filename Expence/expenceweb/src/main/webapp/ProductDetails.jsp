<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div ng-controller="ProductDetailCtrl">
	<h4>Products Details</h4>
	<table style="border: 1px solid black">
		<tr>
			<td>Product name</td>
			<td>{{prodDetails.productName}}</td>
		</tr>
		<tr>
			<td>Product Description</td>
			<td>{{prodDetails.productDescription}}</td>
		</tr>
		<tr>
			<td>Product Manufacture</td>
			<td>{{prodDetails.productManufacture}}</td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td>{{prodDetails.productPrice}}</td>
		</tr>
		<tr>
			<td>Product Stocks</td>
			<td>{{prodDetails.productStock}}</td>
		</tr>
	</table>
	<hr>
	<a href="<spring:url value="/cart" />"
                           class="btn btn-default"><span class="glyphicon glyphicon-hand-right"></span>View Cart</a>
</div>