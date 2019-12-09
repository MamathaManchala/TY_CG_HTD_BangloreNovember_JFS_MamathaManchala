
package com.capg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class HashMap2 {
	public static void main(String[] args) {
		HashMap<Integer,Student> h1=new HashMap<Integer,Student>();
		
		h1.put(34,new Student("mammu",23));
		h1.put(45,new Student("nani",24));
		h1.put(34,new Student("mammu",26));
		h1.put(null,new Student("hema",27));
		h1.put(null, null);
		
		Collection<Student> c1=h1.values();		
		
		for (Student s1 : c1) {
			System.out.println(s1);
			
		}
		
		
		
//		
//		for (Integer i1: s1) {
//			System.out.println(i1.getKey();
//			
//		}
		
		System.out.println(h1.containsKey(45));
		System.out.println(h1.containsValue(new Student("nani",24)));//without override gives false
		System.out.println(h1.isEmpty());
		
		
		
		
	}
	
	


}
