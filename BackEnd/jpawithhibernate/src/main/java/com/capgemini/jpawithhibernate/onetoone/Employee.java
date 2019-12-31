package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.manytoone.EmployeeExp;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	
	
	
	
	//bidirectional
	
	@OneToOne(cascade=CascadeType.ALL , mappedBy = "emp")
    private EmployeeOther other;
	
	
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="emp")
//	private EmployeeExp exp;
	

}
