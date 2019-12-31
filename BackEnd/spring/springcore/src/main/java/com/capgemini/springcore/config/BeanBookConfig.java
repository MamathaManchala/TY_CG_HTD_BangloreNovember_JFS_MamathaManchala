package com.capgemini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcore.beans.Book;
import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Pet;

public class BeanBookConfig {

	
	@Bean("java")
	@Primary
	public Java getJava() {
		return new Java();
		
	}
	

	@Bean("sql")
	
	public Sql getSql() {
		return new Sql();
		
	}
	
	@Bean("book")
	public Book getBook() {
		Book book= new Book();
		book.setAuthor(getJava());
		book.setName("quireies");
		//pet.setAnimal(getDog());//autowired
		return book;
}
}
