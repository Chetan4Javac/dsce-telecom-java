package me.util;
/**
 * Class to demonstrate usage of continue statement by printing selectively
 * 
 * @author Chetan Gorkal
 *
 */
public class SelectiveNumbersPrinter {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i > 10 && i < 15)
				continue;
			System.out.println(i);
		}
	}

}
