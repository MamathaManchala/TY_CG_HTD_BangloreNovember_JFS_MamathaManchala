package typeCasting;

public class TestAnimal {
public static void main(String[] args) {
	Animal a1=new Animal();
	a1.eat();
	
	System.out.println("---------");
	
	Animal a2=new Dog();//upcasting
	a1.eat();
	System.out.println("---------");
	
	Animal a3=new Lion();
	a1.eat();
	System.out.println("---------");
	
	Dog d1=new Dog();
	d1.eat();
	d1.walk();
	System.out.println("---------");
	
	Dog d2=(Dog) a2;//downcasting
	d1.eat();
	d1.walk();
}
}
