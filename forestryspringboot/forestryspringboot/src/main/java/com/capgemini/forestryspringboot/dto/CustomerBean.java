package com.capgemini.forestryspringboot.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="customer_info")
public class CustomerBean  {

	@Id
	@Column
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private int postalCode;
	@Column
	private String email;
	@Column
	private long telephoneNo;









}



