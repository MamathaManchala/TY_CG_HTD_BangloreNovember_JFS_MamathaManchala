package com.capgemini.mywebapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="Employee_info")
public class EmployeeInfoBean {
	@Id
	@Column(name = "emp_id")
	private int empId;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private int age;
	@Column
	private String password;
	@Column
	private String designation;
	
}//End of class
