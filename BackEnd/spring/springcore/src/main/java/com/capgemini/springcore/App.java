package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
    	Hello hello=context.getBean(Hello.class);
    	Hello hello2=context.getBean(Hello.class);
    	System.out.println("**********************");
    	System.out.println(hello==hello2);
    	System.out.println("**********************");
    	System.out.println(hello);
    	System.out.println(hello2);
    	System.out.println("**********************");
    	hello.setCount(Integer.parseInt("10000"));
    	System.out.println(hello.getMsg());
    	System.out.println(hello.getCount());
      	System.out.println("**********************");
      	Animal a1= context.getBean(Animal.class);
      	a1.makeSound();
      	System.out.println("**********************");
      	Pet p1=context.getBean(Pet.class);
      	System.out.println(p1.getName());
      	p1.getAnimal().makeSound();
    	
    }
}
