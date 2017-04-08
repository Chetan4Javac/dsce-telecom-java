package me.demo.exception;

public class InvalidUsnException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "USN is not valid";
	}

}
