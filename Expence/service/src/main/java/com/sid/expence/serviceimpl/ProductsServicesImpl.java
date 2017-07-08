package com.sid.expence.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.expence.common.vo.Products;
import com.sid.expence.dao.ProductDao;
import com.sid.expence.service.ProductServices;

@Service
public class ProductsServicesImpl implements ProductServices {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public Products getById(int pid) {
		// TODO Auto-generated method stub
		return productDao.getById(pid);
	};

}
