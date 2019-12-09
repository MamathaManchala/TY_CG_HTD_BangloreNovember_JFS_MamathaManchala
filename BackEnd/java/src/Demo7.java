
public class Demo7 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("mammu");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1=s1.append("nani");
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}

}
