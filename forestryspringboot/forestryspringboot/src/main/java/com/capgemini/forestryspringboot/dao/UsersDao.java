package com.capgemini.forestryspringboot.dao;

import com.capgemini.forestryspringboot.dto.UsersBean;

public interface UsersDao {
	
	public boolean register(UsersBean bean);
	public UsersBean login(String username, String password);

}
