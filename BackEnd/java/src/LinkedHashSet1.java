import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {
public static void main(String[] args) {
	

	

	LinkedHashSet l1 =new LinkedHashSet();
	 
	l1.add(12);
	l1.add(44);
	l1.add(12);
	l1.add(67);
	l1.add("mammu");
	l1.add(3.45);
	l1.add(null);
	l1.add(3);
	
 Iterator itr=l1.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());
 }
	
	
	
	
}
}