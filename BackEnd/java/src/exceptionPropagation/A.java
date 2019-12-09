package exceptionPropagation;

public class A {
	public static void main(String[] args) {
		try {
		B.m();
		System.out.println("executed");
	}
		catch(ClassNotFoundException e) {
			System.out.println("exception handled in A class");//ececuted becoz class name is not defined with correct package.
		}

}
}

