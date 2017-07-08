package com.sid.expence.dao;

import com.sid.expence.common.vo.Users;

public interface UserDao {
	
	public Users checkLogin(String username,String password);

}
