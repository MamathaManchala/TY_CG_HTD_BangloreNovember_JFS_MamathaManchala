
public class TestPerson1  extends Person1{
	
	
	public TestPerson1(String name) {
		super(name);
	}
	
	public static void main(String[] args) throws Throwable {
		System.out.println("main starts");
		Person1 p1=new Person1("nani");
		TestPerson1 p2=new TestPerson1("mikel");
		p1.finalize();//throwable
		p2.finalize();
		p1=null;
		System.gc();//gc not happens
		System.out.println("main ends");
	}

}
