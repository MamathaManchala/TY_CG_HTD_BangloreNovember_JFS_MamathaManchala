
public class Student implements Comparable<Student> {
	String name;
	int age;
	int salary;
	public Student(String name, int age,int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary=salary;
	}
	
	
	
//	@Override
//	public int compareTo(Student o) {
//		
//		//return 0;//only mammu comes as op
//	}
	
	
	//based on age--------------------------------------------------------------------------------------
	
	
	
	
//@Override
//public int compareTo(Student o) {
//	if(this.age>o.age) {
//		return 1;}
//	else if(this.age<o.age) {
//		return -1;}
//	else {
//	return 0;
//}
//}
	
	//based on salary----------------------------------------------------------------------------


//@Override
//public int compareTo(Student o) {
//	if(this.salary>o.salary) {
//		return 1;}
//	else if(this.salary<o.salary) {
//		return -1;}
//	else {
//	return 0;
//}
//}

	//based on name--------------------------------------------------------------------------------------
	
	@Override
	public int compareTo(Student o) {
		//return this.name.compareTo(o.name);//ascending order
		return o.name.compareTo(this.name);//decending order
	}





@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}
	

}
