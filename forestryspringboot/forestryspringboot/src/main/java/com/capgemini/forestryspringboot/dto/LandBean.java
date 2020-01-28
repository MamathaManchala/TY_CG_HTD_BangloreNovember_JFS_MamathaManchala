package com.capgemini.forestryspringboot.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="land_info")
public class LandBean  {
	@Id
	@Column
	private int landId;
	@Column
	private long landValue;
	@Column
	private String landLocation;
	

}
