package com.capgemini.forestryspringrest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestryspringrest.dto.CustomerBean;
import com.capgemini.forestryspringrest.dto.CustomerResponse;
import com.capgemini.forestryspringrest.service.CustomerService;

@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping(path="/add-customer",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse addCustomer(@RequestBody CustomerBean bean) {
		CustomerResponse response = new CustomerResponse();
		if(service.addCustomer(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/get-customer",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse getCustomer(@RequestParam("CustomerId") int CustomerId) {
		CustomerResponse response = new CustomerResponse();
		CustomerBean bean=service.getCustomer(CustomerId);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer found");
			response.setCustomer(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/get-allcustomers",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse getAllCustomer() {
		CustomerResponse response = new CustomerResponse();
		List<CustomerBean> list=service.getAllCustomer();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer found");
			response.setCustomer(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-customer/{CustomerId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public CustomerResponse deleteCustomer(@PathVariable("CustomerId") int CustomerId) {
		CustomerResponse response = new CustomerResponse();
		if(service.deleteCustomer(CustomerId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Customer deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Customer not found");
		}
		return response;
	}

}
