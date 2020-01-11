package com.capgemini.retailermaintenance.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
@Table(name="order_info")

public class OrderBean {
	
		@Id
		@Column
		@GeneratedValue
		private int id;
		@Column(nullable = false)
		private int product_id;
		@Column
		private int user_id;
		
		@JsonIgnore
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="product_id",referencedColumnName = "id")
		@JoinColumn(name="user_id",referencedColumnName = "id")
		private UserBean ubean;
		private ProductBean pbean;
	}

