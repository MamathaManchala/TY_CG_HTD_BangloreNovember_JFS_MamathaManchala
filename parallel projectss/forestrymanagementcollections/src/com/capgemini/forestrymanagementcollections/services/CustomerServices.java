package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.CustomerBean;



public interface CustomerServices {

	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(CustomerBean bean);
	public boolean deleteCustomer (int customerId);
	public CustomerBean getCustomer(int customerId);
	public List<CustomerBean>getAllCustomer();
}
