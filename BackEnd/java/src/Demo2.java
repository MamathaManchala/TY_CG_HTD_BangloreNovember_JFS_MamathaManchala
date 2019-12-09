
public class Demo2 {
public static void main(String[] args) {
	String s1=new String("john");//s1
	System.out.println(s1.hashCode());
	String s2=new String("mikel");
	System.out.println(s2.hashCode());//s2
	String s3=new String("john");
	s1=new String("divya");
	System.out.println(s1.hashCode());//address diff but same ref
	
	System.out.println(s3.hashCode());//same address of s1 with ref s3//defaultly override hashcode method
}
}
