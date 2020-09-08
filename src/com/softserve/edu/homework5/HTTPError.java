package com.softserve.edu.homework5;

public enum HTTPError {
	HTTP400("Bad Request"),
	HTTP401("Unauthorized"),
	HTTP402("Payment Require"),
	HTTP403("Forbidden"),
	HTTP999("Invalid error code");
	
	private String message;
	private HTTPError (String message) {
		this.message = message;
		
	}
	public String getMessage() {
		return message;
	}
	
}
