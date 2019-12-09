package customchecked;

public class Person {
	public static void main(String[] args) {
		Election e1=new Election();
		try {
			//e1.vote(17);
			e1.vote(19);
		}
		catch(AgeLimitException e) {
			System.out.println(e.getMsg());
		}
	}

}
