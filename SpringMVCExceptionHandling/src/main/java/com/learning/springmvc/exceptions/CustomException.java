package com.learning.springmvc.exceptions;

public class CustomException extends Exception{

	private static final long serialVersionUID = -4454576494839301345L;

	private String message = "This is an exception..";
	
	
	/**
	 * Constructor
	 * @param message
	 */
	public CustomException(String message) {
		
		this.message = message;
		
	}
	
	
	/**
	 * Getter
	 * @return message
	 */
	public String getMessage() {
		
		return message;
		
	}
	
	
	/**
	 * Setter
	 * @param message
	 */
	public void setMessage(String message) {
		
		this.message = message;
		
	}
	
}
