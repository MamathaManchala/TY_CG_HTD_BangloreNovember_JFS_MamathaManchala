package com.capg.map.treemap;

import java.util.Comparator;

public class SortingName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sName.compareTo(o2.sName);//ascending order
	}

}
