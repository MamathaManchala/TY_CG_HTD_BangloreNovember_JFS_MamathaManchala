package com.capgemini.springcore.config;

import com.capgemini.springcore.beans.Author;

public class Sql implements Author{

	@Override
	public String bookName() {
		System.out.println("Quiriessssss");
		return bookName();		
	}

}
