package com.sid.expence.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sid.expence.common.vo.Cart;
import com.sid.expence.dao.CartDao;
import com.sid.expence.service.CartServices;
@Service
public class CartServiceImp implements CartServices {
	
	@Autowired
	private CartDao cartDao;

	@Override
	public Cart getCartById(int cid) {
		// TODO Auto-generated method stub
		return cartDao.getCartById(cid);
	}

	



}
