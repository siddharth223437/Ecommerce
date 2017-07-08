package com.sid.expence.dao;

import java.util.List;

import com.sid.expence.common.vo.Products;

public interface ProductDao {
	
	public List<Products> getAllProducts();
	public Products getById(int pid);

}
