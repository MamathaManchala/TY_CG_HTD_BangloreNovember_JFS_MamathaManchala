package com.capg.map.treemap;

public class Student implements Comparable<Student> {
	int sAge;
	String sName;
	@Override
	public String toString() {
		return "Student [sAge=" + sAge + ", sName=" + sName + "]";
	}
	public Student(int sAge, String sName) {
		super();
		this.sAge = sAge;
		this.sName = sName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sAge;
		result = prime * result + ((sName == null) ? 0 : sName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sAge != other.sAge)
			return false;
		if (sName == null) {
			if (other.sName != null)
				return false;
		} else if (!sName.equals(other.sName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		
	
			if(this.sAge>o.sAge) {
				return 1;}
			else if(this.sAge<o.sAge) {
				return -1;}
			else {
			return 0;
	}
		
		//return this.sName.compareTo(o.sName);//ascending order
		
		

	}
}
