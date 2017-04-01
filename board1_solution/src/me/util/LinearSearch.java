package me.util;
import java.util.Arrays;

/**
 * Class to implement linear search algorithm
 * 
 * @author Chetan Gorkal
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int searchElement = 4;

		for (int i = 0; i < myIntArray.length; i++) {
			if (myIntArray[i] == searchElement) {
				System.out.println(
						"In " + Arrays.toString(myIntArray) + "element " + searchElement + " is found at index " + i);
			}
		}

	}

}
