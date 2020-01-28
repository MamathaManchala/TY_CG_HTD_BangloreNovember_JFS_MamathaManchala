package com.capgemini.forestryspringrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringrest.dao.CustomerDao;
import com.capgemini.forestryspringrest.dto.CustomerBean;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

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
