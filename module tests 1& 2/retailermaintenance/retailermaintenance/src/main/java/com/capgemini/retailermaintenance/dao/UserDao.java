package com.capgemini.retailermaintenance.dao;

import com.capgemini.retailermaintenance.dto.UserBean;

public interface UserDao {
	
	public boolean createProfile(UserBean user);
	public UserBean login(String email,String password);
	//public boolean changePassword(int id, String password);

}
