package hashSetClass;

import java.util.HashSet;

public class HashSet1 {
public static void main(String[] args) {
	
	HashSet h1=new HashSet();//not generic type//uses object
	
	h1.add(23);
	h1.add(null);
	h1.add(34);
	h1.add("mammu");
	h1.add(58);
	h1.add(null);
	h1.add(34);//takes only once duplicates
	System.out.println(h1);
	
	for(Object obj :h1) {
		System.out.println(obj);
		System.out.println(h1.hashCode());
	}
	
	
	System.out.println("..........................................");
	
	HashSet<String> h2=new HashSet<String>();//geniric type//use string type only
	
	h2.add("kavi");
	h2.add("jyo");
	h2.add(null);
	h2.add("jyo");
	
	for(String s1 :h2) {
		System.out.println(s1);
		System.out.println(h1.hashCode());
	}
	
	
}
}
