package com.capg.map.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
	
		SortingAge sa=new SortingAge();
		SortingName sn=new SortingName();
	TreeMap<Student,String> t1=new TreeMap<Student,String>(sa);
	t1.put(new Student(12,"mammu"),"1st standard");
	t1.put(new Student(15,"jyo"),"5st standard");
	t1.put(new Student(10,"kavi"),"9st standard");

	Set<Map.Entry<Student, String>> s1=t1.entrySet();
	for (Entry<Student, String> e1 : s1) {
		System.out.println(e1.getValue());
		System.out.println(e1.getKey());
		System.out.println("---------------------------");
	}

}
}