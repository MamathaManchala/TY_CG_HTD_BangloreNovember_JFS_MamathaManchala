package exceptionPropagation;

public class A {
	static void o() {
		try {
		B.n();
		
	}
		catch(ArithmeticException a2) {
			System.out.println("A class "+a2.getMessage());
		}

}
}
