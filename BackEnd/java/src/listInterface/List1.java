package listInterface;


import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		
		l1.add(0, 1);
		l1.add(1,2);
		l1.add(2, 3);
		l1.add(3, 4);
		
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		
		System.out.println(l1.indexOf(4));
		
		l1.add(2,3);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(4));
		System.out.println("---------------------------------------");
		
		for(int i=0;i<l1.size();i++) {
			//System.out.println(l1.get(3));
			System.out.println(l1.get(i));//get
			
		}
		
		
		List l2=new ArrayList();
		l2.add(0,5);
		l2.add(1, 6);
		l2.add(2, 7);
		l2.add(3, 7);
		l2.add(4, 7);
		System.out.println(l2);
		
		l1.addAll(1, l2);
		System.out.println(l1);//addAll
		System.out.println("---------------------------------------");
		
		l2.set(1,100);
		System.out.println(l2);//set
		
		
		System.out.println(l2.subList(1, 3));//sublist
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
