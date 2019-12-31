package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="EmployeeOther")
public class EmployeeOther {
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@Column
	private String father;
	
	//unidirectional
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee emp;
	
}
