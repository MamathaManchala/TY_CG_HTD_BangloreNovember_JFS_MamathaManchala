package hashSetClass;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet<Student> h3=new HashSet<Student>();
		
		h3.add(new Student("mammu", 22));
		h3.add(new Student("mammu",24));
		h3.add(new Student("kavi",22));
		h3.add(new Student("mammu",23));
		
		
//		Student s1=new Student("mammu",22);
//		Student s2=new Student("mammu",22);
//		
//		System.out.println(s1.equals(s2));//override equals and hashcode methods
		
		for(Student std:h3) {
			//System.out.println(std);
			System.out.println(std.StudName+" and age is "+std.studAge);//override equals and hashcode methods so duplicates are storing
			
		}
	}

}
