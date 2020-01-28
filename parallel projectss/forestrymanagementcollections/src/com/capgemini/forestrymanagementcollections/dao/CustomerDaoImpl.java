package com.capgemini.forestrymanagementcollections.dao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.capgemini.forestrymanagementcollections.bean.CustomerBean;
import com.capgemini.forestrymanagementcollections.exceptions.NotFoundException;

public class CustomerDaoImpl implements CustomerDao{

	private List<CustomerBean> customer=new ArrayList<CustomerBean>();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		for ( CustomerBean cb1: customer) 
		{
			if( cb1.getCustomerId() ==bean.getCustomerId()) 
				throw new NotFoundException("Customer Id Already Exist");
		}
		customer.add(bean);
		return true;
	}

	@Override
	public boolean modifyCustomer(CustomerBean cbean) {
		CustomerBean bean=getCustomer(cbean.getCustomerId());
		if(bean!=null) {
			deleteCustomer(bean.getCustomerId());
			bean.setCustomerName(cbean.getCustomerName());
			bean.setStreetAddress1(cbean.getStreetAddress1());
			bean.setStreetAddress2(cbean.getStreetAddress2());
			bean.setTown(cbean.getTown());
			bean.setPostalCode(cbean.getPostalCode());
			bean.setEmail(cbean.getEmail());
			bean.setTelephoneNo(cbean.getTelephoneNo());
			customer.add(bean);
			return true;
		}
		throw new NotFoundException("Customer Details Not Found");	
		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		CustomerBean bean=null;
		for ( CustomerBean cb1: customer) {
			if(cb1.getCustomerId()==customerId) {
				bean=cb1;
			}
		}
		if(bean!=null) {
			customer.remove(bean);
			return true;
		}
		throw new NotFoundException("Customer Details Not Found");	
	}



	@Override
	public CustomerBean getCustomer(int customerId) {
		CustomerBean bean=null;
		for ( CustomerBean cb1: customer) {
			if(cb1.getCustomerId()==customerId) 

				return cb1;
		}
		throw new NotFoundException("Customer Details Not Found");	
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return customer;
	}



}
