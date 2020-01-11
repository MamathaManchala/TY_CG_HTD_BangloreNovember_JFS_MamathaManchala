package com.capgemini.retailermaintenance.service;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderBean;

public interface OrderServices {
	
	public boolean addOrder(OrderBean order);
	public List<OrderBean> getAllOrders();

}
