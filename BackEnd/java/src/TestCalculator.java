
public class TestCalculator {
public static void main(String[] args) {
	Calculator c1=new Calculator();
	 
	int r1=c1.add(2);
	System.out.println("r1 is"+r1);
	int r2=c1.add(2, 3);
	System.out.println("r2 is"+r2);
	double r3=c1.add(2.4);
	System.out.println("r3 is"+r3);
	
	double m1=Calculator.multiply(2.0);
    int m2=	Calculator.multiply(2, 3);
    System.out.println("m3 is"+m1);
    System.out.println("m3 is"+r3);
}
}
