package com.capg.Dqueue.ArrayDqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrauDeque2 {
	public static void main(String[] args) {
		ArrayDeque<String> a1=new ArrayDeque<String>();
		
		a1.add("mammu");
		a1.add("kavi");
		a1.add("jyo");
		a1.addFirst("jyo");
		a1.add("hema");
		a1.addLast("nani");
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.removeLast());
		
		
		
		
		
		
		
		System.out.println("-------------------------------------");
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
