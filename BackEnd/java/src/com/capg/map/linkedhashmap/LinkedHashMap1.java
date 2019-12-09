package com.capg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
		
		l1.put("OAR",5600312);
		l1.put(null, 4567);
		l1.put("BTM",3496785);
		l1.put("BTR",45678);
		l1.put(null, 234567);
		l1.put("hebbala",null);
		l1.put("rajajinagar",6789);
		
		l1.remove("BTM");
		
		//System.out.println(l1);
		
		Set<Map.Entry<String, Integer>> s1=l1.entrySet();
		
		for (Map.Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("----------------------");
			
		}
		
	}

}
