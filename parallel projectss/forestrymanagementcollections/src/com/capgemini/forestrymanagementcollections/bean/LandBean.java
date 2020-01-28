package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class LandBean implements Serializable {
	
	private int landId;
	private long landValue;
	private String landLocation;

}
