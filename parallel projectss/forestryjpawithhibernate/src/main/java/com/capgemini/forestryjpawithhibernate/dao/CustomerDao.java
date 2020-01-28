package com.capgemini.forestryjpawithhibernate.dao;


import java.util.List;

import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;

public interface CustomerDao {
	
    
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(CustomerBean bean);
	public boolean deleteCustomer (int customerId);
	public CustomerBean getCustomer(int customerId);
	public List<CustomerBean>getAllCustomer();
}




