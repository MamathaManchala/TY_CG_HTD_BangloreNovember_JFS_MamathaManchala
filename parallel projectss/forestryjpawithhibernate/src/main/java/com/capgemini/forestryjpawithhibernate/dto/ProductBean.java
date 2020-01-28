package com.capgemini.forestryjpawithhibernate.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class ProductBean {
	@Id
	@Column
	private int productId;
	@Column
	private String productName;
	@Column
	private String prodDescription;
	@Column
	private int productCost;


}


