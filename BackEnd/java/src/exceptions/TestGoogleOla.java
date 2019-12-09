package exceptions;

public class TestGoogleOla {
	public static void main(String[] args) {
		System.out.println("main starts");
		GoogleMap g1=new GoogleMap();
		Ola o1=new Ola(g1);//this way (2)
		o1.find(null);
		//g1.findLocation(null);//both ways(1) we can give for google map
		System.out.println("main ends");
	}

}
