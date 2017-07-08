package com.sid.expence.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sid.expence.common.vo.Products;
import com.sid.expence.service.ProductServices;


@RestController
public class ProductController {
	
	@Autowired
	private ProductServices productServices;
	
	
	@GetMapping("/allproducts")
	public List<Products> getAllProd(){
		return productServices.getAllProducts();
	}
	
	@GetMapping("/product/{pid}")
	public ResponseEntity<Products> getProductId(@PathVariable("pid") int pid){
		Products prod = productServices.getById(pid);
		return new ResponseEntity(prod,HttpStatus.OK);
	}

}
