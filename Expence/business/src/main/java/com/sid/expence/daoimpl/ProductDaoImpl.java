package com.sid.expence.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sid.expence.common.vo.Products;
import com.sid.expence.dao.ProductDao;

@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Override
	public List<Products> getAllProducts() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From Products");
		List<Products> allProduct = query.list();
		System.out.println(allProduct.size());
		return allProduct;
	}

	@Override
	public Products getById(int pid) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Products p WHERE p.pid = :pid");
		query.setParameter("pid", pid);
		Products prod = (Products) query.uniqueResult();
		System.out.println("In Get By Id"+prod.getProductName());
		return prod;
	}

}
