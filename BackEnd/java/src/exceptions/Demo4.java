package exceptions;

public class Demo4 {
	
	void exception(int a,String b)
	{
		try {
			System.out.println(500/a);
			System.out.println(b.length());//one exception only executes at each time
			}
		catch(ArithmeticException a1) {
			System.out.println("dont deal with 0");
		}
		catch(NullPointerException n) {
			System.out.println("dont deal with null");
		}
		
	}


}
