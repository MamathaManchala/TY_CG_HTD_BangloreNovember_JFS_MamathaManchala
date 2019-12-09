import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		
		l1.add(new Employee("mammu",22));
		l1.add(new Employee("kavi",22));
		l1.add(new Employee("mammu",22));
		l1.add(new Employee("jyo",22));
		
		Iterator<Employee> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());//excecutes toString // gives classname@hashcode
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
