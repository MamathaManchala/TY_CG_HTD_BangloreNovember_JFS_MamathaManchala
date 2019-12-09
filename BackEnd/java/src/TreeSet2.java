import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
public static void main(String[] args) {
	
	Employee e1=new Employee();
	EmployeeAge e2=new EmployeeAge();
	EmployeeSalary e3=new EmployeeSalary();
	
	//TreeSet<Student> t1=new TreeSet<Student>();
	TreeSet<Student> t1=new TreeSet<Student>(e1);//sort can do with this
	
	t1.add(new Student("mammu",22,30000));
	t1.add(new Student("kavi",23,40000));
	t1.add(new Student("jyo",45,30000));
	
	t1.add(new Student("nani",57,50000));
	t1.add(new Student("mammu",22,25000));
	
	Iterator<Student> itr=t1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	//bothways we can iterate
	
	System.out.println("..............................");
	for(Student s1:t1) {
		System.out.println(s1);
	}
	
	
	
}
}
