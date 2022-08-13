package com.Spring.Exceptions;

public class CarAlreadyExistException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CarAlreadyExistException(String message) {
		super(message);
	}
}
