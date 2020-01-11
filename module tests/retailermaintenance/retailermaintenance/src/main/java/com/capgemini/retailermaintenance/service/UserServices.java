package com.capgemini.retailermaintenance.service;

import com.capgemini.retailermaintenance.dto.UserBean;

public interface UserServices {
	
	public boolean createProfile(UserBean user);
	public UserBean login(String email,String password);
	//public boolean changePassword(int id, String password);

}
