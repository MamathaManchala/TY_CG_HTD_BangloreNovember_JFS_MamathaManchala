package com.capgemini.user.service;

import com.capgemini.user.dto.User;

public interface UserService {
	public boolean register(User user);
	public User login(String email,String password);
}
