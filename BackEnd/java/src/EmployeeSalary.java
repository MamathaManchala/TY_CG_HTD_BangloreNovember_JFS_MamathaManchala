import java.util.Comparator;

public class EmployeeSalary implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.salary>o2.salary) {
			return 1;}
		else if(o1.salary<o2.salary) {
			return -1;}
		else {
		return 0;
	}
	
	

}
}
