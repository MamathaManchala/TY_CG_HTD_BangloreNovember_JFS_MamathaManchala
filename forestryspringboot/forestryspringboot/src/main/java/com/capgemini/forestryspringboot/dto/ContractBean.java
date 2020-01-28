package com.capgemini.forestryspringboot.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contract_info")
public class ContractBean  {
	
																						
	@Id
	private int contractNo;
	@Column
	private  int customerId;
	@Column
	private int productId;
	@Column
	private int haulierId;
	@Column
	private String deliveryDate;
	@Column
	private int quantity;


	
	

}
