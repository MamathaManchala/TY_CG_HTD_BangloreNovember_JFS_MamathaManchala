package listInterface;

import java.util.ArrayList;

public class arrayList2 {
	public static void main(String[] args) {
		ArrayList<Integer> a2=new ArrayList<Integer>();
		
		a2.add(11);
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(15);
		System.out.println(a2);
		//a2.remove(12);//takes as index value so exception accors
		a2.remove(new Integer (12));//object removing
		
		System.out.println(a2);
		
		a2.remove(3);
		System.out.println(a2);
		
	}

}
