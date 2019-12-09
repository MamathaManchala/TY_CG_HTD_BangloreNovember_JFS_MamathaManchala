package exceptions;

public class Demo1 {
	void divide(int a,int b) {
		System.out.println("calls divide()");
		try {
		System.out.println(a/b);
	}
		catch(ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
}

}
