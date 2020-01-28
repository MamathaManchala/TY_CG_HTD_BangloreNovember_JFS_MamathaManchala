package com.capgemini.forestrymanagementcollections.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class UsersBean implements Serializable {

	private String username;
	private String password;
	private String userType;
	

}
