package vectorClass;

import java.util.Vector;

public class vector1 {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	v1.add(23);
	v1.add(56);
	v1.add(78);
	v1.add(100);
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("----------trim----------");
	v1.trimToSize();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("-----set---------");
	v1.setSize(10);
	System.out.println(v1.size());
	System.out.println(v1);
	v1.add(200);
	System.out.println(v1);
	v1.add(5,500);
	System.out.println(v1);
	System.out.println("-------------remove---------------");
	v1.remove(2);//index
	//v1.remove(4);//object
	v1.remove(new Integer(7));//object
	System.out.println(v1);
	
	for(int i=0;i<v1.size();i++) {
		System.out.println(v1.get(i));
	}
}
}
