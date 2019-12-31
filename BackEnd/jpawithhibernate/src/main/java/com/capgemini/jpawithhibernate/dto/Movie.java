package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity Class following pojo rules
@Entity
@Table(name="movie")
public class Movie {
	@Id
	@Column(name="id")
private int mid;
	@Column(name="name")
private String mName;
	@Column
private String rating;
	
	
	
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getmName() {
	return mName;
}
public void setmName(String mName) {
	this.mName = mName;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}



}
