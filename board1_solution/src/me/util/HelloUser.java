package me.util;
import java.util.Scanner;

/**
 * Class to read user name from console and print greeting.
 * 
 * @author Chetan Gorkal
 *
 */
public class HelloUser {

	String userName;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HelloUser user = new HelloUser();
		user.userName = scanner.next();
		System.out.println("Hello " + user.toString());
		scanner.close();
	}

	@Override
	public String toString() {
		return this.userName;
	}
}
