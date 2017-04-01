package me.util;
import java.util.Scanner;

/**
 * Class to demo console read write operations using {@link Scanner}
 * 
 * @author Chetan Gorkal
 *
 */
public class ConsoleIO {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scanner.nextInt();
		System.out.println("The integer entered is " + a);
		System.out.println("Enter a double");
		double d = scanner.nextDouble();
		System.out.println("The Double entered is " + d);
		System.out.println("Enter a String");
		String inputString = scanner.next();
		System.out.println("The string entered is " + inputString);
		System.out.println("Thank you");
		scanner.close();
	}

}
