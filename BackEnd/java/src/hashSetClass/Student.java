package hashSetClass;

public class Student {
	String StudName;
	int studAge;
	public Student(String studName, int studAge) {
		super();
		StudName = studName;
		this.studAge = studAge;
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((StudName == null) ? 0 : StudName.hashCode());
		result = prime * result + studAge;
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
		if (StudName == null) {
			if (other.StudName != null)
				return false;
		} else if (!StudName.equals(other.StudName))
			return false;
		if (studAge != other.studAge)
			return false;
		return true;
	}
	
	

}
