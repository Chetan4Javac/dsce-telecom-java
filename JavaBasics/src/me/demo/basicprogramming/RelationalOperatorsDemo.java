package me.demo.basicprogramming;

/**
 * Class to demo relational operators
 * 
 * @author Chetan Gorkal
 *
 */
public class RelationalOperatorsDemo {

	public static void main(String[] args) {

		int a = 5, b = 10;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		if (a < b) {
			System.out.println("a is lesser than b");
		} else {
			System.out.println("b is lesser than a");
		}

		a = b;
		// Note: '==' is relational operator, '=' is assignment operator
		if (a == b) {
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is not equal to b");
		}

		// ternary operator. also known as conditional operator
		// (expression) ? (when expression is true) : (when expression is false)
		a = 5;
		b = 10;
		int largestNumber = (a > b) ? a : b;
		System.out.println("Largest number is: " + largestNumber);

		String result = (a > b) ? "a is greater than b" : "b is greater than a";
		System.out.println(result);
	}

}
