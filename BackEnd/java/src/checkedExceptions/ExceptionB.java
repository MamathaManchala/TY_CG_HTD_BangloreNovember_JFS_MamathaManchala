package checkedExceptions;

public class ExceptionB {
	public static void main(String[] args) {
		
		
	System.out.println("main starts");
		Student s1=new Student();
		
		try {
		Object o1=s1.clone();//only fst exception excecutes
		System.out.println("object is cloned");
		
		Class c1=Class.forName("checkedExceptions.Student");	
	}
		catch(CloneNotSupportedException e) {
		System.out.println("clone is not supported");
	}
		catch(ClassNotFoundException c) {
		System.out.println("class is not found");
	}
		
		System.out.println("main ends");

}
}
