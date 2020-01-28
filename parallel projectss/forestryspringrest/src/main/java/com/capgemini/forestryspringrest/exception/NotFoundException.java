package com.capgemini.forestryspringrest.exception;

public class NotFoundException extends RuntimeException {
	
	String str;

	public NotFoundException(String message) {
		this.str=message;
	}

	@Override
	public String getMessage() {
		return str;
	}


}

