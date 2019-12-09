package com.capg.map.linkedhashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class LInkesHashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> h1=new LinkedHashMap<Integer,Employee>();

		h1.put(34,new Employee("mammu",23));
		h1.put(45,new Employee("nani",24));
		h1.put(34,new Employee("mammu",26));
		h1.put(null,new Employee("hema",27));
		h1.put(null, null);

		System.out.println(h1.get(34));
		
		System.out.println("-------------------------------");

		Set<Map.Entry<Integer,Employee>> s1=h1.entrySet();

		for (Map.Entry<Integer, Employee> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----------------------");

		}




		System.out.println(h1.containsKey(45));
		System.out.println(h1.containsValue(new Employee("nani",24)));//without override gives false
		System.out.println(h1.isEmpty());




	}




}



