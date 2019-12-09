package throwsKeyword;

public class Paytm {
	IRCTC i1;

	public Paytm(IRCTC i1) {
		super();
		this.i1 = i1;
	}
	
	void bookTicket() {
		try {
		i1.confirmTicket();
		System.out.println("ticket is confirmed");
	}
catch(ClassNotFoundException c){
	System.out.println("ticked is not confirmed");
}
}
}


