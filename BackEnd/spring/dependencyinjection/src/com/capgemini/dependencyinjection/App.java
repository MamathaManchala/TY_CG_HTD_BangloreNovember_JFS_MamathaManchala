package com.capgemini.dependencyinjection;

import com.capgemini.dependencyinjection.dao.Animal;
import com.capgemini.dependencyinjection.factory.AnimalFactory;

public class App {
	public static void main(String[] args) {
		
		Animal a1= AnimalFactory.getAnimal();
		a1.makeSound();
	}

}
