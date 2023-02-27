package com.movieapp.exception;

public class ActorsNotExistException extends Exception {
	
	  private String message;
		
	    public String getMessage() {
	        return message;
	    }

	    public ActorsNotExistException(String message) {
	        this.message = message;

	    }

}
