package com.capgemini.retailermaintenance.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductResponse {
	
		private int statusCode;
		private String message;
		private String discription;
		private List<ProductBean> pbean;

	}



