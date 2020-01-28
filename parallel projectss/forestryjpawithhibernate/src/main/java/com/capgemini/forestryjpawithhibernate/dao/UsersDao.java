package com.capgemini.forestryjpawithhibernate.dao;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.UsersBean;

public interface UsersDao {
	
	public UsersBean login(UsersBean bean);
	
	public boolean addClient(UsersBean bean);
	public boolean deleteClient(String username);
	public List<UsersBean>getAllClients();
	
	public boolean addScheduler(UsersBean bean);
	public boolean deleteScheduler(String username);
	public List<UsersBean>getAllSchedulers();
	
	
	
}
