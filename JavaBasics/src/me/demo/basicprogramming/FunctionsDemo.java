package me.demo.basicprogramming;

/**
 * Class to demo user defined functions
 * 
 * @author Chetan Gorkal
 *
 */
public class FunctionsDemo {

	public static void main(String[] args) {
		// function without parameters.
		printNumbers();

		// function receiving two parameters.
		printNumbersBetween(1, 50);

		// function receiving parameters and returning a value.
		int largestNumber = getLargestNumber(1, 2);
		System.out.println("Largest Number is: " + largestNumber);
	}

	/**
	 * Method to print numbers from 1 to 10
	 */
	public static void printNumbers() {
		System.out.println("Printing from 1 to 10 from printNumbers() function");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	/**
	 * Method to print numbers between minNumber and maxNumber passed
	 * 
	 * @param minNumber
	 *            Minimum number to be printed
	 * @param maxNumber
	 *            Maximum number to be printed
	 */
	private static void printNumbersBetween(int minNumber, int maxNumber) {

		System.out.println("Printing from " + minNumber + " to " + maxNumber + " from printNumbersBetween() function");
		for (int i = minNumber; i <= maxNumber; i++) {
			System.out.println(i);
		}

	}

	/**
	 * Method to find the largest number.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return Largest number of the two passed numbers
	 */
	private static int getLargestNumber(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		return secondNumber;
	}

	public static double myFunction(int a) {
		double d = 1.1;
		return d;
	}

}
