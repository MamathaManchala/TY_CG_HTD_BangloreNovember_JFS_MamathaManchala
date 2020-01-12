package com.capgemini.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.user.dao.UserDAO;
import com.capgemini.user.dto.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;
	
	@Override
	public boolean register(User user) {
		return dao.register(user);
		
	}

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

}
