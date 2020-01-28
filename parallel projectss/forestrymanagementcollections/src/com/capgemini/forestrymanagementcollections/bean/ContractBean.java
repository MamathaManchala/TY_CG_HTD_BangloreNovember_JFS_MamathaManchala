package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContractBean implements Serializable {
	
	private int contractNo;
	private  int customerId;
	private int productId;
	private int haulierId;
	private String deliveryDate;
	private int quantity;


}
