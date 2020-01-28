package com.capgemini.forestrymanagementcollections.services;

import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.CustomerBean;
import com.capgemini.forestrymanagementcollections.dao.CustomerDao;
import com.capgemini.forestrymanagementcollections.factory.ForestryFactory;


public class CustomerServicesImpl implements CustomerServices {
	
	CustomerDao customerDao =ForestryFactory.instanceOfCustomerDaoImpl();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return customerDao.addCustomer(bean);
	}

	@Override
	public boolean modifyCustomer(CustomerBean bean) {
		return customerDao.modifyCustomer(bean);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		return customerDao.deleteCustomer(customerId);
	}

	@Override
	public CustomerBean getCustomer(int customerId) {
		return customerDao.getCustomer(customerId);
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	
}
