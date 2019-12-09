package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		Collection c2=new ArrayList();
		
		c2.add("nani");
		System.out.println(c2);
		
		System.out.println(c2.size());
		
		c2.remove("nani");
		System.out.println(c2);
		
		System.out.println(c2.size());
		
		c2.add("bujji");
		
		
	System.out.println(c2.contains("bujji"));
	
	System.out.println(c2.isEmpty());
	
	
	}

}
