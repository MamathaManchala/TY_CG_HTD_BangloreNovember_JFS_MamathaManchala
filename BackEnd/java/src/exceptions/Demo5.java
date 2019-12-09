package exceptions;

public class Demo5 {
	void exception(int a,String b)
	{
//		try {
//			System.out.println(500/a);
//		    try {
//			System.out.println(b.length());
//			}
//		    catch(NullPointerException n) {
//				System.out.println("dont deal with null");
//			}
//		}
//	
//		
//		catch(ArithmeticException a1) {
//			System.out.println("dont deal with 0");
//		}
		try {
			System.out.println(500/a);
		    try {
			System.out.println(b.length());
			}
		    catch(ArithmeticException a1) {
				System.out.println("dont deal with 0");
			}
		    
		}	
		catch(NullPointerException n) {
			System.out.println("dont deal with null");
		}
		}
	}
		
		
	


