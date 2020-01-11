package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.OrderBean;
import com.capgemini.retailermaintenance.dto.OrderResponse;
import com.capgemini.retailermaintenance.service.OrderServices;

@RestController
public class OrderController {
	

	@Autowired
	OrderServices service;
	
	@PostMapping(path="/add-order",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addOrder(@RequestBody OrderBean order) {
		OrderResponse response = new OrderResponse();
		if(service.addOrder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("order not added!!!");
		}
		return response;
	}
	
	
	@GetMapping(path="/get-allorders",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getAllOrders() {
		OrderResponse response = new OrderResponse();
		List<OrderBean> list=service.getAllOrders();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Orders found");
			response.setObean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("No data");
		}
		return response;
		
	}
	


}
