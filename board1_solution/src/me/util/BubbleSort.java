package me.util;
import java.util.Arrays;

/**
 * Class to implement bubble sort algorithm
 * 
 * @author Chetan Gorkal
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] myIntArray = { 41, 32, 23, 44, 56, 46, 77, 68, 79, 15 };
		int temp;
		for (int i = 0; i < myIntArray.length; i++) {
			for (int j = i; j < myIntArray.length; j++) {
				if (myIntArray[j] < myIntArray[i]) {
					temp = myIntArray[j];
					myIntArray[j] = myIntArray[i];
					myIntArray[i] = temp;
				}
			}
			/*
			 * Uncomment below to observe smallest number bubbling to least
			 * index on each iteration
			 */
			System.out.println(Arrays.toString(myIntArray));
		}
		System.out.println("------------------");
		System.out.println(Arrays.toString(myIntArray));
	}

}
