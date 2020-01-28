package com.capgemini.forestryspringrest.service;

import com.capgemini.forestryspringrest.dto.UsersBean;

public interface UserService {

	public boolean register(UsersBean bean);
	public UsersBean login(String username, String password);
}
