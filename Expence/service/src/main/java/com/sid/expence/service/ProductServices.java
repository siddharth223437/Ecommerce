package com.sid.expence.service;

import java.util.List;

import com.sid.expence.common.vo.Products;

public interface ProductServices {
	
	public List<Products> getAllProducts();
	public Products getById(int pid);

}
