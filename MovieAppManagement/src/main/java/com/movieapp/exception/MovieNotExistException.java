package com.movieapp.exception;

public class MovieNotExistException extends Exception {
	
	  private String message;
	
	    public String getMessage() {
	        return message;
	    }

	    public MovieNotExistException(String message) {
	        this.message = message;

	    }

}
