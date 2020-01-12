package com.capgemini.user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {
	
	@Column(unique=true,nullable=false)
	private String name;
	@Id
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private int phone;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String role;
}
