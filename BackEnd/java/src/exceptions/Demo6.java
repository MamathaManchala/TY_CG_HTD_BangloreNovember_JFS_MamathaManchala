package exceptions;

public class Demo6 {
	public static void main(String[] args) {
		System.out.println("main startrs");
		
		try {
			System.out.println(50/0);
			
		}
		catch(ArithmeticException a) {
			System.out.println("dont deal with zero");
		}
		finally {
			System.out.println("finally is executed");
		}
	
	System.out.println("main ends");
	}

}
