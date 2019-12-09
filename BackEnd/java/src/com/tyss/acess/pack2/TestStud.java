package com.tyss.acess.pack2;

import com.tyss.acess.pack1.Student;


public class TestStud extends Student {
	
	protected TestStud(String name) {
		super(name);
	}
	void studDetails() {
		System.out.println("nam is Mammuuu");
	}
	public static void main(String[] args) {
		TestStud s1=new TestStud("mammu");
		s1.studDetails();
		s1.studentDetails();
	}

}
