package com.capgemini.forestryjpawithhibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class UsersBean implements Serializable{
	@Id
	@Column
	String username;
	@Column
	String password;
	@Column
	String userType;

}
