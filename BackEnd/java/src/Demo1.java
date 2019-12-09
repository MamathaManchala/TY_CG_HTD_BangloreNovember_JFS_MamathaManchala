
public class Demo1 {
public static void main(String[] args) {
	String s1="mammu";
	System.out.println(s1.hashCode());
	
	String s2="kavi";
	System.out.println(s2.hashCode());
	
	s1="jyo";//creating new oject.address diff but with same ref s1
	System.out.println(s1.hashCode());
	
	String s3="mammu";//duplicate value of mammu;which is already exist.//takes s1 address only
	System.out.println(s3.hashCode());
	
	String s4=" kavi ";//giving space so creates new object
	System.out.println(s4.hashCode());
	

}
}
