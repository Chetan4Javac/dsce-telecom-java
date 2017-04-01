package me.util;
import java.util.Arrays;

/**
 * Class to find minimum element in an integer array
 * 
 * @author Chetan Gorkal
 *
 */
public class MinElementFinder {

	public static void main(String[] args) {
		int[] myIntArray = { 41, 32, 23, 44, 56, 46, 77, 68, 79, 15 };
		int minElement = 999;
		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] < minElement) {
				minElement = myIntArray[i];
			}
		}
		System.out.println("Minimum element in " + Arrays.toString(myIntArray) + " is " + minElement);
	}

}
