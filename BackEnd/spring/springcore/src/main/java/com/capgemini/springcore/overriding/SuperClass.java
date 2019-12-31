package com.capgemini.springcore.overriding;

import java.util.Stack;
import java.util.Vector;

public class SuperClass {
	
	protected Vector<Object> method(){
		
		return null;
	}

	public Stack<Object> method(Vector<Object> v) throws RuntimeException {
		return null;
	}

}
