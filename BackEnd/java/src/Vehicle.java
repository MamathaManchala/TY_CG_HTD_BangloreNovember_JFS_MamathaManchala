
public class Vehicle implements Cloneable {
	
String name;

Vehicle(String name){
	super();//not mandotary
	
	this.name=name;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
