package com.capgemini.springcore.beans;

public class Book {
	private String name;
	private Author author;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book() {
		super();
		this.name = name;
		this.author = author;
	}
	
}
