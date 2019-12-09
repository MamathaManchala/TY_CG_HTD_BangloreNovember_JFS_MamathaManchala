package exceptionPropagation;

public class TestABC {
	public static void main(String[] args) {
		System.out.println("main starts");
		TestABC t=new TestABC();
		A.o();
		//with out throw we will get message one time only..because all methods calls by itself
		System.out.println("main ends");
		
	
	}

}

