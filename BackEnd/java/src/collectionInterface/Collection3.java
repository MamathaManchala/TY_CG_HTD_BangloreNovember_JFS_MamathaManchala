package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		
		Collection c1=new ArrayList();
		
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		System.out.println(c1);
		Collection c2=new ArrayList();
		c2.add(5);
		c2.add(6);
		c2.add(3);
		c2.add(4);
		System.out.println(c2);
		c1.addAll(c2);
		System.out.println(c1);
		
		System.out.println("----------------------------addAll()");
		Collection c3=new ArrayList();
		c3.add(1);
		c3.add(2);
		c3.add(3);
		c3.add(4);
		System.out.println(c3);
		Collection c4=new ArrayList();
		c4.add(5);
		c4.add(6);
		c4.add(3);
		c4.add(4);
		System.out.println(c4);
		c3.removeAll(c4);
		System.out.println(c3);
		System.out.println("-------------------------------removeall()");
		
		
		Collection c5=new ArrayList();
		c5.add(9);
		c5.add(8);
		c5.add(7);
		c5.add(6);
		System.out.println(c4);
		c4.retainAll(c5);
		System.out.println(c4);
		
		System.out.println("---------------------------------retainAll()");
		
		System.out.println(c4.containsAll(c5));
		System.out.println(c4);
		c4.clear();
		System.out.println(c4);
		
		System.out.println("------------------------------------------");
		Collection c6=new ArrayList();
		c6.add(11);
		c6.add(12);
		
		Object a[]=c6.toArray();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
