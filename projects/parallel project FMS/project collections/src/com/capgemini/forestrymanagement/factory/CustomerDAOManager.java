
package com.capgemini.forestrymanagement.factory;

import com.capgemini.forestrymanagement.dao.CustomerDAO;
import com.capgemini.forestrymanagement.dao.CustomerDAOImpl;

public class CustomerDAOManager {
	
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}

}
