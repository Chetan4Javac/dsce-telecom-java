package me.demo.basicprogramming;

/**
 * Class to demo arithmetic operators
 * 
 * @author Chetan Gorkal
 *
 */
public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {

		int a = 10, b = 5;
		System.out.println("a = " + a + ", b = " + b);
		int sum = a + b;
		System.out.println("Sum of a and b is: " + sum);// 15

		int difference = a - b;
		System.out.println("Difference between a and b is: " + difference);// 5

		int product = a * b;
		System.out.println("Product of a and b is: " + product);

		int remainder = a % b; // modulus operator
		System.out.println("Remainder of a / b is: " + remainder);

		int quotient = a / b;
		System.out.println("Quotient of a / b is: " + quotient);

		// pre increment
		a = 0;
		System.out.println("a before pre increment: " + a);// 0
		System.out.println("pre increment, a: " + ++a);// 1

		// post increment
		a = 0;
		System.out.println("a before post increment: " + a);// 0
		System.out.println("post increment, a: " + a++); // 0
		System.out.println("a after post increment: " + a);// 1

	}

}
