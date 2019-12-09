
package coustumException;

public class DayLimitException extends RuntimeException{
	
 String msg="day limit exceeded";

DayLimitException(){
	
}
DayLimitException(String m){
	this.msg=m;
}

public String getMessage() {
	return this.msg;
}
}
