package linkedList;

import java.util.LinkedList;

public class LinkedList2 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	l1.add(3);
	l1.add(5);
	l1.add(3);
	l1.add(6);
	
	System.out.println(l1);
	l1.addFirst(100);
	l1.addLast(200);
	System.out.println(l1);
	System.out.println("-------------remove-----------");
	l1.remove();
	System.out.println(l1);
	System.out.println("-------------remove f & l-----------");
	l1.removeFirst();
	l1.removeLast();
	System.out.println(l1);
	System.out.println("-------------remove f o & l o-----------");
	l1.removeFirstOccurrence(3);
	l1.removeLastOccurrence(3);
	System.out.println(l1);
	System.out.println("-------------get-------");
	
	System.out.println(l1.getFirst());
	
	System.out.println(l1.getLast());
	
	
	
	
	
	
	
	
	
	
	
}
	
}
