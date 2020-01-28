package com.capgemini.forestryspringrest.dto;

import java.util.List;

import lombok.Data;
@Data
public class SchedulerResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<SchedulerBean> schedule;

}
