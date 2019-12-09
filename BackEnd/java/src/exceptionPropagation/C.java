package exceptionPropagation;

public class C {
	
	static void m() {
		
		try {
		//System.out.println(10/5);
		System.out.println(10/0);
	}
		catch(ArithmeticException a) {
			System.out.println("c class  "+a.getMessage());
			throw a;
		}

}
}
