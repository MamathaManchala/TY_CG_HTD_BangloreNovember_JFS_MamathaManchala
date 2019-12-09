package com.tyss.acess.pack2;

import com.tyss.acess.pack1.Dog;

//import static com.tyss.acess.pack1.Dog.age;//for static var only

import static com.tyss.acess.pack1.Dog.*;//for all static members


public class TestDog1 {
public static void main(String[] args) {
	System.out.println("age is"+age);
	Dog d1=new Dog("puppy",5);
	d1.dogDetails();
	details();
}
}
