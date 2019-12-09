package linkedList;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(21);
		l1.add(34);
		l1.add(38);
		l1.add(89);
		l1.add(56);
		System.out.println(l1);
		
		System.out.println("-----------peek--------");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("------poll------------");
		
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		System.out.println("------offer----------------");
		
	
		
		System.out.println(l1.offer(100));
		System.out.println(l1);
		System.out.println(	l1.offerFirst(200));
		System.out.println(l1.offerLast(300));
		System.out.println(l1);
	}

}
