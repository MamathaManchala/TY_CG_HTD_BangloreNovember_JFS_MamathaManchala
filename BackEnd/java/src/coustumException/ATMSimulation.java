package coustumException;

public class ATMSimulation {
	
	void withdraw(double amount) {
		if(amount>40000) {
			throw new DayLimitException();
			//throw new DayLimitException("exceeded");//like this also prints output
			
		}
	}

}
