package com.capg.map.linkedhashmap;

public class Employee {
	

		String EmpName;
		int EmpAge;
		
		
		
		
		
		
		public Employee(String empName, int empAge) {
			super();
			EmpName = empName;
			EmpAge = empAge;
		}
		@Override
		public String toString() {
			return "Employee [EmpName=" + EmpName + ", EmpAge=" + EmpAge + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + EmpAge;
			result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
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
			Employee other = (Employee) obj;
			if (EmpAge != other.EmpAge)
				return false;
			if (EmpName == null) {
				if (other.EmpName != null)
					return false;
			} else if (!EmpName.equals(other.EmpName))
				return false;
			return true;
		}
		
		
		

	}



