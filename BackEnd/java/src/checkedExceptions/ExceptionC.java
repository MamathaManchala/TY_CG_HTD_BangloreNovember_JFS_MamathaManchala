package checkedExceptions;

public class ExceptionC {
	public static void main(String[] args) {
		System.out.println("main starts");
		
		try {
			//Class c1=Class.forName("Person");//catch block executed
			Class c1=Class.forName("checkedExceptions.Person");
			System.out.println("class is fount");
		}
			catch(ClassNotFoundException e) {
			System.out.println("class is not found");
		}
		System.out.println("main ends");
	}

}
