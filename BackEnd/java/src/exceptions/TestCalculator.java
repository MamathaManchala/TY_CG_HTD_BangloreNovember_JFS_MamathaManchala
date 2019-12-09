package exceptions;

public class TestCalculator {
	public static void main(String[] args) {
	System.out.println("main starts");
	Calculator c1=new Calculator();
	//System.out.println("main ends");//prints output
	c1.divide(10,0);
	System.out.println("calls divide method");//not prints
	//System.out.println("main ends");//not prints output
	}
}
