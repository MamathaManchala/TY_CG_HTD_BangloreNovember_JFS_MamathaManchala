package customchecked;

public class AgeLimitException extends Exception {
	//String msg="age should be more than 18";
	String msg;

	//public AgeLimitException() {
	//	super();
	//}

	public AgeLimitException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}


	
	

}
