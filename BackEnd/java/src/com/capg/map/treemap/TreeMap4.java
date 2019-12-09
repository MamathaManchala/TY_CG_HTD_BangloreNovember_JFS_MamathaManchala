package com.capg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap4 {
	public static void main(String[] args) {
		
	
	TreeMap <String,ArrayList<Student>> t1=new TreeMap<String,ArrayList<Student>>();
	
	ArrayList<Student> a1=new ArrayList<Student>();
	a1.add(new Student(20,"divya"));
	a1.add(new Student(20,"shree"));
	a1.add(new Student(20,"anu"));
	
	ArrayList<Student> a2=new ArrayList<Student>();
	a2.add(new Student(20,"d'''ya"));
	a2.add(new Student(20,"shrvghjee"));
	a2.add(new Student(20,"anfghju"));
	
	ArrayList<Student> a3=new ArrayList<Student>();
	a3.add(new Student(20,"divrtyuya"));
	a3.add(new Student(20,"shfghree"));
	a3.add(new Student(20,"ansdfghyjuiku"));
	
	
	
	t1.put("eng 1st year",a1);
	
	t1.put("eng 2st year",a2);
	
	t1.put("eng 3st year",a3);
	
	
	
	
	Set<Map.Entry<String,ArrayList<Student>>> s1=t1.entrySet();
	
	for (Map.Entry<String, ArrayList<Student>> e1 : s1) {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("-----------------------");
	}
	
	

}
}