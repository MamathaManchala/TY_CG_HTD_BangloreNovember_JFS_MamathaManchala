package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.Employee;

import lombok.Data;



@Data
@Entity
@Table(name="Employee_ExpInfo")
public class EmployeeExp {
	@Id
	@Column
		private int expId;
	@Column
		private String cName;
	@Column
		private int expYears;
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="eid")
		private Employee emp;
}
