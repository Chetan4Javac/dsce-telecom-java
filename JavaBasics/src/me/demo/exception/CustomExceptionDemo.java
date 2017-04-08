package me.demo.exception;

/**
 * Class to demo custom exceptions in Java
 * 
 * @author Chetan Gorkal
 *
 */
public class CustomExceptionDemo {

	public static void main(String[] args) throws InvalidAgeException {
		StudentDataReader reader = new StudentDataReader();
		int age = 10;
		String usn = "1DS";
		reader.read(age, usn);
	}
}
