
public class Demo5 {
	public static void main(String[] args) {
		
	
String s1=new String("mammu");
System.out.println(s1);
System.out.println(s1.hashCode());

s1=new String("nani");
System.out.println(s1);
System.out.println(s1.hashCode());

s1=s1.concat("bujji");
System.out.println(s1);
System.out.println(s1.hashCode());
}
}