
package vectorClass;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(23);
		v1.addElement(34);
		v1.addElement(78);
		v1.addElement(89);
		v1.add(97);
		v1.add(102);
		v1.add(128);
		v1.remove(5);
		System.out.println(v1);
		System.out.println(v1);
		v1.remove(new Integer(34));
		System.out.println(v1);
		v1.removeElement(new Integer(23));
		System.out.println(v1);
		v1.removeElementAt(2);
		System.out.println(v1);
		
		Object [] i1=new Object[v1.size()];
		v1.copyInto(i1);
		
		for(int i=0;i<v1.size();i++) {
			System.out.println(i1[i]);
		}
		
	}

}
