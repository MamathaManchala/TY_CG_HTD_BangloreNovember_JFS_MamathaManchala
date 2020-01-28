package com.capgemini.forestryspringboot.controller;


import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestryspringboot.dto.ProductResponse;
import com.capgemini.forestryspringboot.dto.LandBean;
import com.capgemini.forestryspringboot.dto.LandResponse;
import com.capgemini.forestryspringboot.dto.ProductBean;
import com.capgemini.forestryspringboot.service.ProductServices;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*",allowCredentials="true")
public class ProductController {
	@Autowired
	ProductServices service;
	
	@PostMapping(path="/add-products",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		System.out.println(" IM IN ADDpRODUCT desc: "+bean.getProdDescription()+" name:  "+bean.getProductName()
		+" cost "+ bean.getProductCost()+ " ID: "+bean.getProductId());
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
			response.setProductBean(Arrays.asList(bean));
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
			response.setProductBean(list);
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
	
	
	@PutMapping(path ="/update-product",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody ProductBean bean) {
		ProductResponse response=new ProductResponse();
		 if(service.modifyProduct(bean)) {
				response.setStatusCode(201);
				response.setMessage("Success");
				response.setDescription("Product updated");
			} else {
				response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Product not updated!!!");
			}
			return response;
		}
	}

