package com.capg.map.hashmap;

public class Student {
	String StudName;
	int StudAge;
	public Student(String studName, int studAge) {
		super();
		StudName = studName;
		StudAge = studAge;
	}
	@Override
	public String toString() {
		return "Student [StudName=" + StudName + ", StudAge=" + StudAge + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudAge;
		result = prime * result + ((StudName == null) ? 0 : StudName.hashCode());
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
		if (StudAge != other.StudAge)
			return false;
		if (StudName == null) {
			if (other.StudName != null)
				return false;
		} else if (!StudName.equals(other.StudName))
			return false;
		return true;
	}
	

}
