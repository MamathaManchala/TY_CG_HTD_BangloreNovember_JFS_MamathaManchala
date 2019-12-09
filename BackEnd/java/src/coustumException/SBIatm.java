package coustumException;

public class SBIatm {
public static void main(String[] args) {
	System.out.println("main starts");
	ATMSimulation a1=new ATMSimulation();
	
	try {
	a1.withdraw(41000);
	}
	catch(DayLimitException e) {
	System.out.println(e.getMessage());
}
	System.out.println("main ended");
}
}
