package me.util;
/**
 * Class to find factorial of a number
 * 
 * @author Chetan Gorkal
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int n = 5;

		int factorial = n, nCopy = 5;

		while (n != 1) {
			factorial = factorial * (n-- - 1);
		}
		System.out.println("Factorial of " + nCopy + " is " + factorial);
	}

}
