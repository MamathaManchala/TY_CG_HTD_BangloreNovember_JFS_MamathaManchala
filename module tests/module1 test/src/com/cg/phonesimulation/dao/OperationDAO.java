package com.cg.phonesimulation.dao;

import com.cg.phonesimulation.bean.PhoneBean;

public interface OperationDAO {

	public boolean addContact(PhoneBean bean);

	public boolean deleteContact(String name);

	public boolean editContact(String name);

}
