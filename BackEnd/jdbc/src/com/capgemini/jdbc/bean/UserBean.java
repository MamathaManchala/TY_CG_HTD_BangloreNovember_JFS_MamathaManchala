package com.capgemini.jdbc.bean;

import java.io.Serializable;

import lombok.Data;
//@Data//no need to write all the set and get methods
@Data
public class UserBean implements Serializable {
	private int userid;
	private String username;
	private String email;
	private String password;
	private String address;
	
@Override
	public String toString() {
		return "UserBean [userid=" + userid + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", address=" + address + "]";
	}
	
	
	
	

}
