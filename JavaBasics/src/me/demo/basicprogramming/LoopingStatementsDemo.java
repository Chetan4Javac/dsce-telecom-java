package me.demo.basicprogramming;

/**
 * Class to demo looping statements
 * 
 * @author Chetan Gorkal
 *
 */
public class LoopingStatementsDemo {

	public static void main(String[] args) {

		// looping statements: for loop
		for (int i = 0; i < 5; i++) {
			// variable i is visible only inside for loop.
			System.out.println("i: " + i);
		}
		// variable i cannot be accessed outside for loop block.
		// System.out.println(i);

		int j = 0;
		while (j < 5) {
			System.out.println("j: " + j);
			j++;
		}

		int k = 0;
		do {
			System.out.println("k: " + k);
			k++;
		} while (k < 5);

	}

}
