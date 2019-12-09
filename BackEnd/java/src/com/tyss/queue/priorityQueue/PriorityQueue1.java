package com.tyss.queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	Queue p1= new PriorityQueue();
	p1.offer(76);
	p1.offer(89);
	p1.offer(12);
	p1.offer(67);
	p1.offer(99);
	p1.offer(1);
	p1.offer(45);
	p1.offer(2);
	System.out.println(p1);
	System.out.println("-----------poll----------");
	p1.poll();
	System.out.println(p1);
	System.out.println("-----------peek-------------");
	System.out.println(p1.peek());
	System.out.println("---------------remove--------");
	p1.remove();
	System.out.println(p1);
	System.out.println("-----element------------");
	
	System.out.println(p1.element());
	
	
	
	System.out.println("-----------iteration----------");
	for (Object o1 : p1) {
		System.out.println(o1);
	}
	
}
}
