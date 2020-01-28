package com.capgemini.forestryspringrest.dao;

import com.capgemini.forestryspringrest.dto.UsersBean;

public interface UsersDao {
	
	public boolean register(UsersBean bean);
	public UsersBean login(String username, String password);

}
