package com.sid.expence.daoimpl;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sid.expence.common.vo.Cart;
import com.sid.expence.dao.CartDao;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory=sessionFactory;
	}

	@Override
	public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
		return null;
	}

}
