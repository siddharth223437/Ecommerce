<div ng-controller="ProductCtrl">
<h4>In Product List</h4>
<hr>
<button type="submit">Your Cart</button>
<hr>
<div class="table-responsive">
	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Type</th>
				<th>Product Price</th>
			</tr>
		</thead>
		<tr ng-repeat="plist in getAllProd">
			<td>{{plist.pid}}</td>
			<td>{{plist.productName}}</td>
			<td>{{plist.productType}}</td>
			<td>{{plist.productPrice}}</td>
			<td><a href="#!/product/{{plist.pid}}"><span class="glyphicon glyphicon-info-sign"></span></a></td>
		</tr>
	</table>
</div>



</div>