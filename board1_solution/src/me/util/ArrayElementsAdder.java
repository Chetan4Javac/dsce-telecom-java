package me.util;

/**
 * Class to find sum of elements of an integer array
 * 
 * @author Chetan Gorkal
 *
 */
public class ArrayElementsAdder {

	public static void main(String[] args) {
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(addArrayElements(myIntArray));

	}

	public static int addArrayElements(int[] myIntArray) {

		int sumOfArrayElements = 0;
		for (int i = 0; i < myIntArray.length; i++) {
			sumOfArrayElements = sumOfArrayElements + myIntArray[i];
		}
		/*
		 * System.out.println( "Sum of elements of integer array " +
		 * Arrays.toString(myIntArray) + " is " + sumOfArrayElements);
		 */ return sumOfArrayElements;
	}

}
