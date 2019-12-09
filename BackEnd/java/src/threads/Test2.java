package threads;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Thread2 t2=new Thread2();
		
		Thread t1=new Thread(t2);
		t1.start();
		System.out.println("main ends");
	}

}
