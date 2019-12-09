package exceptions;

public class Demo2 {
	void write() {
		String s1=null;
		try {
		System.out.println(s1.length());
	}
		catch(NullPointerException e){
			System.out.println("dont deal with null values");
		}
	}

}
