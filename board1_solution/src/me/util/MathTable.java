package me.util;
/**
 * Class to print math tables from 1 to 10
 * 
 * @author Chetan Gorkal
 *
 */
public class MathTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

}
