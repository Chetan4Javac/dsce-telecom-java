package me.util;
import java.util.Arrays;

/**
 * Class to implement binary search algorithm
 * 
 * @author Chetan Gorkal
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// sorted array
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchElement = 4;
		int lowerIndex = 0, highIndex = myIntArray.length, midIndex = (highIndex + lowerIndex) / 2;

		// Termination condition
		while (highIndex > lowerIndex) {
			if (myIntArray[midIndex] == searchElement) {
				System.out.println("In " + Arrays.toString(myIntArray) + "element " + searchElement
						+ " is found at index " + midIndex);
				break;
			} else if (myIntArray[midIndex] > searchElement) {
				highIndex = midIndex;
			} else {
				lowerIndex = midIndex;
			}
			midIndex = (highIndex + lowerIndex) / 2;
		}

	}

}
