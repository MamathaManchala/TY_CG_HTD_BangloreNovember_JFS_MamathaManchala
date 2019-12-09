
public class Testdemo4 {
public static void main(String[] args) {
	demo4 d=new demo4("mammu",23);
	System.out.println(d.hashCode());
	d=new demo4("nani",23);
	System.out.println(d.hashCode());
	int age=d.getAge();
	String name=d.getName();
	System.out.println("age is"+age);
	System.out.println("name is"+name);
}
}
