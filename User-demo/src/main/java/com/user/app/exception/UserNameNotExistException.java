package com.user.app.exception;

public class UserNameNotExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserNameNotExistException() {
		super();
	 
	}

	public UserNameNotExistException(String message) {
		 super(message);
	}
	
	

}
