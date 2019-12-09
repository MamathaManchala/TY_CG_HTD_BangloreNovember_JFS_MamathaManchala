
public class Car extends Vehicle {
  int cost=30000;
void carDetails() {
	int cost=20000;
	System.out.println("local var cost is"+cost);
	System.out.println("same class non static var cost is"+this.cost);
	System.out.println("parent class var cost is"+super.cost);
	
}
}
