package com.capgemini.forestryspringrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.UsersDao;
import com.capgemini.forestryspringrest.dto.UsersBean;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersDao dao;
	@Override
	public boolean register(UsersBean bean) {
		return dao.register(bean);
	}

	@Override
	public UsersBean login(String username, String password) {
		return dao.login(username, password);
	}

}
