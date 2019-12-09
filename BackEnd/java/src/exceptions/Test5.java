package exceptions;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Demo4 d1=new Demo4();
		d1.exception(0, "nani");
		d1.exception(2, null);
		//d1.exception(0, "nani");
		//d1.exception(0, null);
	System.out.println("main ends");
	}

}
