package exceptions;

public class GoogleMap {
	
	void findLocation(String loc) {
		try {
			System.out.println(loc.length());
		}
		catch(NullPointerException n) {
			System.out.println("Google map user plz fill the loc name");
			throw n;//by this ola also gets exception
			
		}
		
	}

}

