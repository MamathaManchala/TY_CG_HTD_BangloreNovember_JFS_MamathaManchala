package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	
	public static void main(String[] args) {
		
	Collection c1=new ArrayList();
	
	
	c1.add(12);//adding element inside the collection
	System.out.println(c1);
	c1.remove(12);//removing element
	System.out.println(c1);
	
	System.out.println(c1.size());//finding size of the collection
	
	System.out.println(c1.isEmpty());//checking that collection is empty or  not
	
	System.out.println(c1.contains(12));
	c1.add(15);
	System.out.println(c1.contains(15));//checking whether 15 object is there or not in collection

}
}
