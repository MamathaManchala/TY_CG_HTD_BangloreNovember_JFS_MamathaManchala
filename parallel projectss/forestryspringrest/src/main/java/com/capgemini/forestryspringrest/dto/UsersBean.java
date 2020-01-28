package com.capgemini.forestryspringrest.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users_info")
public class UsersBean {
	@Id
	@Column
	String username;
	@Column
	String password;
	@Column
	String userType;

}
