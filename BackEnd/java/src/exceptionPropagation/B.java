package exceptionPropagation;

public class B {
	static void n() {
		try {
		C.m();
	}
		catch(ArithmeticException a1) {
			System.out.println("B class  "+a1.getMessage());
			throw a1;
		}

}
}