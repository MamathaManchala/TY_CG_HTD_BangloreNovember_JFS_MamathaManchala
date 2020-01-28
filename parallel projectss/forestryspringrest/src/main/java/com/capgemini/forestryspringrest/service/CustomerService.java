package com.capgemini.forestryspringrest.service;


import java.util.List;

import com.capgemini.forestryspringrest.dto.CustomerBean;

public interface CustomerService {
	
    
	public boolean addCustomer(CustomerBean bean);
	public boolean modifyCustomer(CustomerBean bean);
	public boolean deleteCustomer (int customerId);
	public CustomerBean getCustomer(int customerId);
	public List<CustomerBean>getAllCustomer();
}




