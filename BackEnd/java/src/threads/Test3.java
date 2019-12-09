package threads;

public class Test3 {
public static void main(String[] args) {
	
	System.out.println("main starts");
	PVR p=new PVR();
	
	User u1=new User(p);
	u1.start();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	p.leaveMe();
	
	System.out.println("main ends");
	
}
}
