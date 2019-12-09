package customchecked;

public class Election {

	void vote(int age) throws AgeLimitException {
		if(age<18) {
			//throw new AgeLimitException();
			throw new AgeLimitException("not eligible");
			
		}
		else {
			System.out.println("eligible for vote");
		}
	}
}
