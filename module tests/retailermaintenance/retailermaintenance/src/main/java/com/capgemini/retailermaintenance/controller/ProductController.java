package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.ProductBean;
import com.capgemini.retailermaintenance.dto.ProductResponse;
import com.capgemini.retailermaintenance.service.ProductServices;

@RestController
public class ProductController {
	
	
		@Autowired
		ProductServices service;
		
		@PostMapping(path="/add-product",produces = MediaType.APPLICATION_JSON_VALUE,
				consumes = MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse addProduct(@RequestBody ProductBean product) {
			ProductResponse response = new ProductResponse();
			if(service.addProduct(product)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDiscription("Product added");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDiscription("Product not added!!!");
			}
			return response;
		}
		
		@GetMapping(path="/get-product",produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse getProduct(@RequestParam("productId") int productId) {
			ProductResponse response = new ProductResponse();
			ProductBean product=service.getProduct(productId);
			if(product!=null) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDiscription("Product found");
				response.setPbean(Arrays.asList(product));
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDiscription("Product id does not exist");
			}
			return response;
		}
		
		@GetMapping(path="/get-allproducts",produces = MediaType.APPLICATION_JSON_VALUE)
		public ProductResponse getAllProducts() {
			ProductResponse response = new ProductResponse();
			List<ProductBean> list=service.getAllProducts();
			if(list.size()!=0) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDiscription("Products found");
				response.setPbean(list);
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDiscription("No data");
			}
			return response;
			
		}
		


}
