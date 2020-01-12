package com.capg.sprgboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String url;
	@Column(unique=true,nullable=false)
	private String name;
	@Column
	private double cost;
}
