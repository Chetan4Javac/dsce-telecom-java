package me.util;
/**
 * Class to print Fibonacci series up to n terms
 * 
 * @author Chetan Gorkal
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		int firstTerm = 0, secondTerm = 1;
		int noOfTermsToPrint = 10;
		System.out.print(firstTerm + " ");
		System.out.print(secondTerm + " ");
		int nextTerm;
		for (int i = 0; i < noOfTermsToPrint - 2; i++) {
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			System.out.print(nextTerm + " ");
		}
	}

}
