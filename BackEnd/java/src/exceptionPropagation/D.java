package exceptionPropagation;

public class D {
	static void o() throws ClassNotFoundException {
		Class.forName("exceptionPropagation.A");
		//Class.forName("A");
	}

}
