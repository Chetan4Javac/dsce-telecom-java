package me.util;
import java.util.Arrays;

/**
 * Class to merge two arrays into a single array
 * 
 * @author Chetan Gorkal
 *
 */
public class ArraysMerger {

	public static void main(String[] args) {
		int[] sourceIntArray1 = { 41, 32, 23, 44, 56, 46, 77, 68, 79, 15 };
		int[] sourceIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] mergedIntArray = new int[sourceIntArray1.length + sourceIntArray2.length];

		for (int i = 0; i < sourceIntArray1.length; i++) {
			mergedIntArray[i] = sourceIntArray1[i];
		}
		for (int j = 0; j < sourceIntArray2.length; j++) {
			mergedIntArray[sourceIntArray1.length + j] = sourceIntArray2[j];
		}

		System.out.println("Source array 1 is " + Arrays.toString(sourceIntArray1));
		System.out.println("Source array 2 is " + Arrays.toString(sourceIntArray2));
		System.out.println("Merged array is " + Arrays.toString(mergedIntArray));

	}

}
