
public class TestEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(22,"mammu");
	System.out.println(e1.hashCode());
	Employee e2=new Employee(23,"jyothi");
	System.out.println(e2.hashCode());
	System.out.println(e2);//defaultly calls tostring
	System.out.println(e2.toString());
	Object o1=new Object();
}
}
