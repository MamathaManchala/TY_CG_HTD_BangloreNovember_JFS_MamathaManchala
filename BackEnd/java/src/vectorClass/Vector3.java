package vectorClass;

import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(34);
		v1.addElement(56);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		//v1.ensureCapacity(6);
		v1.ensureCapacity(8);
		//v1.setSize(8);
		v1.setSize(12);
		System.out.println(v1.size());
		System.out.println(v1.capacity());//doubles the capacity
		System.out.println(v1);
		
		v1.removeAllElements();
		System.out.println(v1);
		
	}

}
