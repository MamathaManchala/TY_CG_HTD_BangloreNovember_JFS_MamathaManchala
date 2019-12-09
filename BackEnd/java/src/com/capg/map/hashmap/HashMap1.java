package com.capg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		
		h1.put(6, "mammu");
		h1.put(1,"kavi");
		h1.put(89, "jyo");
		h1.put(66,"nani");
		h1.put(11,"hema");
		
		Set<Map.Entry<Integer,String>>s1=h1.entrySet();	
		
		for (Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("*******************************************");
			
		}
		}

}
