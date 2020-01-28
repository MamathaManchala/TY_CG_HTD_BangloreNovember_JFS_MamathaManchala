package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBean implements Serializable {


	private Integer customerId;
	private String customerName;
	private String streetAddress1;
	private String streetAddress2;
	private String town;
	private int postalCode;
	private String email;
	private long telephoneNo;

}



