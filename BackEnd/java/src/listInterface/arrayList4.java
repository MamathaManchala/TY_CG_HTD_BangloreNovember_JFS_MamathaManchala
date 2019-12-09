package listInterface;

import java.util.ArrayList;

public class arrayList4 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("hema");
		a1.add("mammu");
		a1.add("kavi");
		a1.add("jyo");
		System.out.println(a1);
		a1.add("nani");
		System.out.println(a1);
		a1.remove("nani");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains("nani"));
		System.out.println(a1.size());
		
		System.out.println("-----------------------------------------");
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("yashu");
		a2.add("loki");
		a2.add("anu");
		System.out.println(a2);
		
		a1.addAll(a2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println(a1);
		System.out.println("-----------------------------------------");
		
      Object a[]=a2.toArray();
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
