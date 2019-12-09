package linkedList;

import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(2);
		l1.add(5);
		l1.add(8);
		l1.add(4);
		System.out.println(l1);
		l1.push(100);
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		
		System.out.println(l1.element());
		System.out.println(l1);
	}

}
