package me.demo.exception;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Invalid age entered.";
	}

}
