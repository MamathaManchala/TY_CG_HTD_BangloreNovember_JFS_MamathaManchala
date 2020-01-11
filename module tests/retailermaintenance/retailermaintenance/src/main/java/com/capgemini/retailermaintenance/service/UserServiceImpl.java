package com.capgemini.retailermaintenance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.UserDao;
import com.capgemini.retailermaintenance.dto.UserBean;

@Service
public class UserServiceImpl implements UserServices {
	
	
		@Autowired
		private UserDao userdao;
		

		public UserBean login(String email, String password) {
			return userdao.login(email, password);
		}

		public boolean createProfile(UserBean user) {
			return userdao.createProfile(user);
		}

//		@Override
//		public UserBean changePassword(UserBean bean) {
//			return userdao.changePassword(bean);
//		}

}
