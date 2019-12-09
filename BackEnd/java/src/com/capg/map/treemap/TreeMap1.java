package com.capg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
public static void main(String[] args) {
	TreeMap<Integer,String> t1=new TreeMap<Integer,String>();
	
	t1.put(1223,"mammu");
	t1.put(34,"kavi");
	t1.put(56,"jyo");
	t1.put(1223,"mammu");
	//t1.put(null, null);
	//t1.put(null, "nani");
	t1.put(122,null);
	
	
	System.out.println(t1.get(56));
	System.out.println("-----------------------------------------");
	
	Set<Map.Entry<Integer,String>> s1=t1.entrySet();
	for(Map.Entry<Integer, String> e1:s1){
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("-----------------------------------------");
	}

     System.out.println(t1.isEmpty());
     System.out.println(t1.containsKey(34));
     System.out.println(t1.size());
     t1.remove(1223);
     System.out.println(t1);
     


}
}
