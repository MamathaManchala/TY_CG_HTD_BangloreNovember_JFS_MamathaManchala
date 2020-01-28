package com.capgemini.forestryspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.forestryspringboot.dao.CustomerDao;
import com.capgemini.forestryspringboot.dto.CustomerBean;
import com.capgemini.forestryspringboot.exception.NotFoundException;
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
