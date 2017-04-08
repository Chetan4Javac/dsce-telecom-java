package me.demo.basicprogramming;

/**
 * Class to demo arrays
 * 
 * @author Chetan Gorkal
 *
 */
public class ArraysDemo {

	public static void main(String[] args) {
		int[] myIntegers1; // array declaration
		myIntegers1 = new int[5]; // array initialization

		// length property of an array gives the size i.e. number of elements
		// that can be stored in the array
		System.out.println("Length of array myIntegers1 is: " + myIntegers1.length);// 5

		// index of array starts from 0.
		// For ex: For an array of length 5, indexes will range from 0 to 4

		System.out.println("myIntegers1[0]: " + myIntegers1[0]);// 0 default
		System.out.println("myIntegers1[1]: " + myIntegers1[1]);// 0 default
		System.out.println("myIntegers1[2]: " + myIntegers1[2]);// 0 default
		System.out.println("myIntegers1[3]: " + myIntegers1[3]);// 0 default
		System.out.println("myIntegers1[4]: " + myIntegers1[4]);// 0 default

		// print array elements using for loop.
		System.out.println("Printing array before assigning values. default value 0 should be printed:");
		for (int i = 0; i < myIntegers1.length; i++) {
			System.out.println(myIntegers1[i]); // 0 default value
		}

		// assigning values to array.
		myIntegers1[0] = 5;
		myIntegers1[1] = 15;
		myIntegers1[2] = 25;
		myIntegers1[3] = 35;
		myIntegers1[4] = 45;
		// Below is not valid. (Remember Array index out of bound?)
		// myIntegers1[5] = 50;

		System.out.println("Printing array after assigning values:");
		// print array elements using for loop
		for (int i = 0; i < myIntegers1.length; i++) {
			System.out.println(myIntegers1[i]);// 5 15 25 35 45
		}

		// In-line declaration and initialization of array
		int[] myIntegers2 = new int[4];
		System.out.println("Length of array myIntegers2 is: " + myIntegers2.length);// 4

		for (int i = 0; i < myIntegers2.length; i++) {
			System.out.println(myIntegers2[i]); // 0 default value
		}

		// declare and initialize array with user values.
		int[] myIntegers3 = new int[6];
		System.out.println("Length of array myIntegers3 is: " + myIntegers3.length);// 6

		for (int i = 0; i < myIntegers3.length; i++) {
			myIntegers3[i] = 100;
		}

		for (int i = 0; i < myIntegers3.length; i++) {
			System.out.println(myIntegers3[i]); // 100
		}

		// Below is valid
		int[] myIntegers4 = { 10, 100, 110, 120 };
		System.out.println("Length of array myIntegers4 is: " + myIntegers4.length);// 4

		for (int i = 0; i < myIntegers4.length; i++) {
			System.out.println(myIntegers4[i]); // 10
		}

		int[] myIntegers5 = { 1, 2, 3 };
		System.out.println("Length of array myIntegers5 is: " + myIntegers5.length);// 6

		for (int i = 0; i < myIntegers5.length; i++) {
			System.out.println(myIntegers5[i]); // 10
		}

	}

}
