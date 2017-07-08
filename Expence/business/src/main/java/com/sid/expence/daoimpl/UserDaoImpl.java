package com.sid.expence.daoimpl;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sid.expence.common.vo.Users;
import com.sid.expence.dao.UserDao;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Users checkLogin(String username, String password) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("FROM Users u WHERE u.username=:username AND u.password=:password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		Users users =  (Users) query.uniqueResult();
		if(users!=null){
			return users;
		}
		return users;
	}

}
