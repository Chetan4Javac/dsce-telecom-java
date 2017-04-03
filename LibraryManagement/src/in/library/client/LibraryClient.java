/**
 * 
 */
package in.library.client;

import java.util.Scanner;

import in.library.bean.Student;

/**
 * CLient class to read students from console
 * 
 * @author Chetan Gorkal
 *
 */
public class LibraryClient {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int numberOfStudents = scanner.nextInt();
		Student[] students = new Student[numberOfStudents];
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student first name:");
			Student student = new Student();
			student.setFirstName(scanner.next());
			System.out.println("Enter student last name:");
			student.setLastName(scanner.next());
			students[i] = student;
		}
		scanner.close();
		System.out.println(students.length);
		for (Student student : students) {
			System.out.println("First name: " + student.getFirstName() + " Last name: " + student.getLastName());
		}

	}

}
