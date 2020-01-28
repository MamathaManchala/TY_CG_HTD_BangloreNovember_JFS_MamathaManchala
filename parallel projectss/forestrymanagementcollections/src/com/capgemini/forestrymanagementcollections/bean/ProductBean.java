package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductBean implements Serializable {

	private int productId;
	private String productName;
	private String prodDescription;
	private int productCost;


}


