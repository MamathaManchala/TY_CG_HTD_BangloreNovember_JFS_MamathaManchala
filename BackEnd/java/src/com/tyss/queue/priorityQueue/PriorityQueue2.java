package com.tyss.queue.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[] args) {
		
		PriorityQueue<Student> p1= new PriorityQueue<Student>();
		
		p1.offer(new Student(22,"mammu"));
		p1.offer(new Student(23,"kavi"));
		p1.offer(new Student(22,"mammu"));
		
		for (Student student : p1) {
		System.out.println(student);	
		}
		
	}

}
