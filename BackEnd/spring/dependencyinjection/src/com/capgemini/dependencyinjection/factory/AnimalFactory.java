package com.capgemini.dependencyinjection.factory;

import com.capgemini.dependencyinjection.dao.Animal;
import com.capgemini.dependencyinjection.dao.Dog;

public class AnimalFactory {
	
	private AnimalFactory() {//if we have no non static methods its good to create private constructor
		
	}
	
	public static Animal getAnimal() {
		return new Dog();
	}

}
