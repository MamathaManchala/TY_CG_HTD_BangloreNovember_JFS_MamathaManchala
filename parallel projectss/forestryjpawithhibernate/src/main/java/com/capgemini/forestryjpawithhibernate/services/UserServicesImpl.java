package com.capgemini.forestryjpawithhibernate.services;


import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.UsersDao;
import com.capgemini.forestryjpawithhibernate.dto.UsersBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class UserServicesImpl implements UserServices {
	
	
	UsersDao usersDao =ForestryFactory.instanceOfUsersDaoImpl();

	public UsersBean login(UsersBean bean) {
		return usersDao.login(bean);
	}

	public boolean addClient(UsersBean bean) {
		return usersDao.addClient(bean);
	}

	public boolean deleteClient(String username) {
		return usersDao.deleteClient(username);
	}

	public List<UsersBean> getAllClients() {
		return usersDao.getAllClients();
	}

	public boolean addScheduler(UsersBean bean) {
		return usersDao.addScheduler(bean);
	}

	public boolean deleteScheduler(String username) {
		return usersDao.deleteScheduler(username);
	}

	public List<UsersBean> getAllSchedulers() {
		return usersDao.getAllSchedulers();
	}

}


