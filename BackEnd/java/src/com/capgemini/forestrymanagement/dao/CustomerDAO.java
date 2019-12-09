package com.capgemini.forestrymanagement.dao;

import java.util.List;

import com.capgemini.forestrymanagement.bean.CustomerBean;

public interface CustomerDAO {
	
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(CustomerBean cbean);
	public boolean deleteCustomer (int customerId);
	public CustomerBean getCustomer(int customerId);
	public List<CustomerBean>getAllCustomer();
}

