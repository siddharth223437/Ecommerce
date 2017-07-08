package com.sid.expence.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.expence.common.vo.Cart;
import com.sid.expence.service.CartServices;

@RestController
public class CartController {
	
	@Autowired
	private CartServices cartServices;
	
	@PostMapping("/addcart")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart){
		System.out.println("In Add to cart");
		//cartServices.create(cart);
		return new ResponseEntity<>(cart,HttpStatus.OK);
	}
	
	@GetMapping("/viewcart/{cartid}")
	public ResponseEntity<Cart> viewCart(@PathVariable("cartid") int cartid, Cart cart){
		//Cart cart = cartServices.read(cartid);
		System.out.println("View cart id completed");
		return new ResponseEntity<Cart>(cart,HttpStatus.OK);
	}

}
