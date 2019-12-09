
public class TestDog {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	Dog d1=new Dog("pinky");
	Class c1=d1.getClass();//gives which class Dog object is exist
	Dog d2=(Dog) c1.newInstance();//downcasting 
	System.out.println(c1);//gives present class name
	System.out.println(d2.name);
	Class c2=Class.forName("Dog");//same as getClass() to call class name present in the object class;here now 12 methos are present in object class including dog class also.
	System.out.println(c2);
	
}
}
