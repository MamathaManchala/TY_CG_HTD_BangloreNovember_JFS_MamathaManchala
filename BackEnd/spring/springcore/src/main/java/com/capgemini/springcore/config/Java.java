package com.capgemini.springcore.config;

import com.capgemini.springcore.beans.Author;

public class Java  implements Author{

	@Override
	public String bookName() {
		System.out.println("programs");
		return bookName();		
	}

}
