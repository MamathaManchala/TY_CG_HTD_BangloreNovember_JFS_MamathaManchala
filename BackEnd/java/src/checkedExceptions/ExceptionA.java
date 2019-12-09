package checkedExceptions;

public class ExceptionA {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		Employee e1=new Employee();
		try {
		Object o1=e1.clone();
		   try {
		Class c1=Class.forName("Employee");
		System.out.println("class is found");
		}
		
	catch(ClassNotFoundException e) {
		System.out.println("class is not found");
	}
		}
		catch(CloneNotSupportedException c) {
		System.out.println("clone is not supported");
	}
		
		
		System.out.println("main ends");
		
}
}

