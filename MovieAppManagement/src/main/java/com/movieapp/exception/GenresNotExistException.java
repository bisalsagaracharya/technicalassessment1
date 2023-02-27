package com.movieapp.exception;

public class GenresNotExistException extends Exception {
   
	  private String message;
		
	    public String getMessage() {
	        return message;
	    }

	    public GenresNotExistException(String message) {
	        this.message = message;

	    }
}
