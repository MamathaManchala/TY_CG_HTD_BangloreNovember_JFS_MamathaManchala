package com.capgemini.empspringboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeResponce {
	
	private int statusCode;
	private String message;
	private String discription;
	private List<EmployeeBean> beans;

}
