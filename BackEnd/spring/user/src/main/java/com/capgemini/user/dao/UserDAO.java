package com.capgemini.user.dao;

import com.capgemini.user.dto.User;

public interface UserDAO {
	public boolean register(User user);
	public User login(String email,String password);
	
}
