package me.util;
import java.util.Arrays;

/**
 * Class to find minimum and maximum elements in an integer array
 * 
 * @author Chetan Gorkal
 *
 */
public class MinMaxFinder {

	public static void main(String[] args) {
		int[] myIntArray = { 41, 32, 23, 44, 56, 46, 77, 68, 79, 15 };
		System.out.println("Minimum element in " + Arrays.toString(myIntArray) + " is " + getMinElement(myIntArray));
		System.out.println("Maximum element in " + Arrays.toString(myIntArray) + " is " + getMaxElement(myIntArray));

	}

	private static int getMinElement(int[] myIntArray) {
		int minElement = 999;
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] < minElement) {
				minElement = myIntArray[i];
			}
		}
		return minElement;
	}

	private static int getMaxElement(int[] myIntArray) {
		int maxElement = 0;
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] > maxElement) {
				maxElement = myIntArray[i];
			}
		}
		return maxElement;
	}

}
