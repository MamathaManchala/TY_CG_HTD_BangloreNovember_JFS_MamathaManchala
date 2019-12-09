package com.capg.Dqueue.ArrayDqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		
		a1.add(23);
		a1.add(2);
		a1.add(45);
		a1.addFirst(99);
		a1.add(56);
		a1.add(33);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
