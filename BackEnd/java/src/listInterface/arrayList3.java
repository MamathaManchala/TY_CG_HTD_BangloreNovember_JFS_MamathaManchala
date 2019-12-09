package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList3 {

public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<String>();
	
	a1.add("nani");
	a1.add("mammu");
	a1.add("kavi");
	a1.add("jyo");
	System.out.println(a1);
	
	System.out.println("---------iterating an arraylist using for loop---------");
	for(int i=0;i<a1.size();i++) {
		System.out.println(a1.get(i));
	}
	System.out.println("---------foreachloop---------");
	for(String i1:a1) {
		System.out.println(i1);
	}
	System.out.println("---------iterator method---------");
	
	Iterator <String> itr=a1.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println("---------list iterator---------");
	
	ListIterator<String> itr3=a1.listIterator(a1.size());
	
	while(itr3.hasPrevious()) {
		System.out.println(itr3.previous());
	}
	System.out.println("----------");
	while(itr3.hasNext()) {
		System.out.println(itr3.next());
	}
	
	
}
}
