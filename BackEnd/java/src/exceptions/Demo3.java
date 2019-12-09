package exceptions;

public class Demo3 {
public static void main(String[] args) {
	System.out.println("mainstarts");
	int [] a1= new int[2];
	a1[0]=2;
	a1[1]=3;
	try {
	a1[2]=4;}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("no size to store ");
	}
	
	System.out.println(a1.length);
	System.out.println("mainends");
	
}
}
