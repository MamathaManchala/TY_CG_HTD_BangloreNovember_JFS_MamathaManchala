package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class SchedulerBean  implements Serializable{
	
	private int scheduleId;
	private int contractId;
	private int ProductId;
	private int quantity;
	private String deliveryDate;

}
