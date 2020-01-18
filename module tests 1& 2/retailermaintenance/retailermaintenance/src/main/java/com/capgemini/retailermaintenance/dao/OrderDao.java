package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderBean;

public interface OrderDao {
	
	public boolean addOrder(OrderBean order);
	public List<OrderBean> getAllOrders();

}
