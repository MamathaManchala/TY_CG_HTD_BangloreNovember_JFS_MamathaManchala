package com.capgemini.springcore.beans;

import org.springframework.stereotype.Component;
@Component
public class Dog implements Animal{

	
	public void makeSound() {
		
		System.out.println("Bow Bowwwwwwww");
	}
	

}
