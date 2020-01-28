package com.capgemini.forestryjpawithhibernate.services;

import java.util.List;

import com.capgemini.forestryjpawithhibernate.dao.CustomerDao;
import com.capgemini.forestryjpawithhibernate.dto.CustomerBean;
import com.capgemini.forestryjpawithhibernate.factory.ForestryFactory;

public class CustomerServicesImpl implements CustomerServices {
	
	CustomerDao customerDao =ForestryFactory.instanceOfCustomerDaoImpl();

	public boolean addCustomer(CustomerBean bean) {
		return customerDao.addCustomer(bean);
	}

	public boolean modifyCustomer(CustomerBean bean) {
		return customerDao.modifyCustomer(bean);
	}

	public boolean deleteCustomer(int customerId) {
		return customerDao.deleteCustomer(customerId);
	}

	public CustomerBean getCustomer(int customerId) {
		return customerDao.getCustomer(customerId);
	}

	public List<CustomerBean> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	
}
