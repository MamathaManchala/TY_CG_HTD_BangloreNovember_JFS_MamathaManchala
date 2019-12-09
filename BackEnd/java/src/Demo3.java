
public class Demo3 {
public static void main(String[] args) {
	
	String s1="mammu";
	System.out.println(s1.toLowerCase());
	System.out.println(s1.toUpperCase());
	System.out.println(s1.length());
	
	String s2="    mammu    ";
	System.out.println(s2.trim());
	
	String s3="mammunani";
	System.out.println(s3.substring(5));
	
	String s4=s1.substring(3);
	System.out.println(s4);
	
	String s5="mammumammu";
	System.out.println(s5.substring(3,7));
	
	System.out.println(s5.isEmpty());
	
	System.out.println(s5.charAt(5));
			
}
}
