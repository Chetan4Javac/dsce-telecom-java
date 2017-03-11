/**
 * Class to demonstrate<br>
 * 1. Define a java bean<br>
 * 2. static and non static variables and methods
 * 
 * @author Chetan Gorkal
 *
 */
public class Student {

	public static String department = "Telecom Dept.";
	public String name;
	public String phone;

	public static void printDepartment() {
		System.out.println(department);
	}

	public void readDepartment() {
		System.out.println("read dept.");
	}

}
