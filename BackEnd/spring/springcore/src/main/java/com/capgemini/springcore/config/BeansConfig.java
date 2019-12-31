package com.capgemini.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Dog;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean("hello")
	@Scope("prototype")
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMsg("I love you Appuu");
		hello.setCount(100);
		return hello;
	}
	
	@Bean("dog")
	public Dog getDog() {
		return new Dog();
	}
	
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
		
	}
	
	@Bean("pet")
	public Pet getPet() {
		Pet pet= new Pet();
		pet.setName("tufy");
		//pet.setAnimal(getDog());//autowired
		return pet;
	}

}
