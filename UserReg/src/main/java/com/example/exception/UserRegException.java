package com.example.exception;

public class UserRegException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public UserRegException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public UserRegException() {
		super();
	}

}
