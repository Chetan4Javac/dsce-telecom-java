
import java.util.Scanner;

/**
 * Program to read a name from system and console and print greeting to system
 * console.
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
