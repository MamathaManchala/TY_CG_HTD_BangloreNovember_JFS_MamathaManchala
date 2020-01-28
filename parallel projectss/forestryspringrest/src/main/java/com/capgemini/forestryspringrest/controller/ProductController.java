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

import com.capgemini.forestryspringrest.dto.ProductBean;
import com.capgemini.forestryspringrest.dto.ProductResponse;
import com.capgemini.forestryspringrest.service.ProductService;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping(path="/add-product",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if(service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not added!!!");
		}
		return response;
	}
	
	@GetMapping(path="/get-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct(@RequestParam("productId") int productId) {
		ProductResponse response = new ProductResponse();
		ProductBean bean=service.getProduct(productId);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
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
			response.setDescription("Products found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
	
	@DeleteMapping(path = "/delete-product/{productId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("productId") int productId) {
		ProductResponse response = new ProductResponse();
		if(service.deleteProduct(productId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found");
		}
		return response;
	}
}
