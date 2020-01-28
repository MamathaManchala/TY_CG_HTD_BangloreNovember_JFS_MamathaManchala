package com.capgemini.forestryspringboot.service;

import com.capgemini.forestryspringboot.dto.UsersBean;

public interface UserService {

	public boolean register(UsersBean bean);
	public UsersBean login(String username, String password);
}
