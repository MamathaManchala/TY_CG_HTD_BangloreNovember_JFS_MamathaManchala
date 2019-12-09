package throwsKeyword;

public class IRCTC {
	void confirmTicket() throws ClassNotFoundException {
		try {
		Class.forName("Paytm");
		System.out.println("ticked confirmed");
	}
		catch(ClassNotFoundException e) {
		System.out.println("ticket not confirmed");
		throw e;
	}

}
}
