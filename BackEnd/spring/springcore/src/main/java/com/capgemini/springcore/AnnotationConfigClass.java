package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;
import com.capgemini.springcore.config.BeansConfig;

public class AnnotationConfigClass {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeansConfig.class);
		
		Hello hello=context.getBean(Hello.class);
		System.out.println(hello.getMsg());
		System.out.println(hello.getCount());
		
		
		System.out.println("******************************");
		Hello hello2=context.getBean(Hello.class);
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println(hello==hello2);
		
		System.out.println("******************************");
		
		Animal a1=context.getBean(Animal.class);
		a1.makeSound();
		
		System.out.println("******************************");
		
		
		Pet pet=context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();//wiring
		
		
		
		
		
		
		
		
	}

}
