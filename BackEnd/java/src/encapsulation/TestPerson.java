package encapsulation;

public class TestPerson {
	public static void main(String[] args) {
		Person p1=new Person();
		
		p1.setAge(19);
		p1.setName("mammu");
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
	}

}
