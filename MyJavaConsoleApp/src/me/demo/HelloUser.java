package me.demo;

import java.util.Scanner;

/**
 * Program to print to system console.
 * 
 * @author Chetan Gorkal
 *
 */
public class HelloUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "!");
		scanner.close();
	}

}
