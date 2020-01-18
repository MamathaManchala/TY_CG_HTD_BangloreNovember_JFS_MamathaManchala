package com.capgemini.retailermaintenance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.OrderDao;
import com.capgemini.retailermaintenance.dto.OrderBean;

@Service
public class OrderServiceImpl implements OrderServices {

	
	@Autowired
	private OrderDao orderdao;
	
	@Override
	public boolean addOrder(OrderBean order) {
		return orderdao.addOrder(order);
	}

	@Override
	public List<OrderBean> getAllOrders() {
		return orderdao.getAllOrders();
	}

}
