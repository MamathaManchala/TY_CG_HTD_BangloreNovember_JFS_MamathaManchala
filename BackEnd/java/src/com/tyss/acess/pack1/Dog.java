package com.tyss.acess.pack1;

public class Dog {
	public static int age;
	String name;
	
	public Dog(String n,int age) {
		this.age=age;
		name=n;
	}
	public void dogDetails() {
		System.out.println("name is"+name);
	}
	public static void details() {
		System.out.println("age is"+age);
	}

}
