package com.sid.expence.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.expence.common.vo.Users;
import com.sid.expence.dao.UserDao;
import com.sid.expence.service.UsersSerives;

@Service
public class UsersServiceImpl implements UsersSerives {
	
	@Autowired
	private UserDao userDao;

	@Override
	public Users checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return userDao.checkLogin(username, password);
	}

}
