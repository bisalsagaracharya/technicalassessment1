package com.user.app.exception;

public class UserNameAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserNameAlreadyExistsException() {
		super();
		 
	}

	public UserNameAlreadyExistsException(String message) {
		super(message);
		 
	}
	
	
      
}
