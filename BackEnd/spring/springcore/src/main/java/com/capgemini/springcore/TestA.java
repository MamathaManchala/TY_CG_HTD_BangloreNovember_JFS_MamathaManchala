package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Author;
import com.capgemini.springcore.beans.Book;
import com.capgemini.springcore.config.BeansConfig;

public class TestA {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);
		
	
		System.out.println("******************************");

		Author a1=context.getBean(Author.class);
		a1.bookName();
		
		System.out.println("******************************");
		
		Book book=context.getBean(Book.class);
		System.out.println(book.getName());
	   book.getAuthor().bookName();//wiring
		
		
	}

}
