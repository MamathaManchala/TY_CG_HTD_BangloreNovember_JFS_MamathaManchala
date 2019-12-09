
public class Demo6 {
		public static void main(String[] args) {
			StringBuilder s1=new StringBuilder("mammu");
			System.out.println(s1.hashCode());
			System.out.println(s1);
			s1=s1.append("nani");
			System.out.println(s1.hashCode());
			System.out.println(s1);
		}

	

}
