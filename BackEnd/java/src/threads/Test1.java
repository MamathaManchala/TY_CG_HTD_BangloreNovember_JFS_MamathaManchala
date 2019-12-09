package threads;

public class Test1 {
public static void main(String[] args) {
	System.out.println("main starts");
	Thread1 t1=new Thread1();
	t1.start();
	System.out.println("main ends");
}
}
