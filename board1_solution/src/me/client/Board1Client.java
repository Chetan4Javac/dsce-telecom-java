package me.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import me.bean.Student;
import me.util.ArrayElementsAdder;

public class Board1Client {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the program you want to execute");
		System.out.println("1. Add elements of an integer array.");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			ArrayElementsAdder elementsAdder = new ArrayElementsAdder();
			int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.println("Sum of elements of integer array " + Arrays.toString(myIntArray) + " is "
					+ elementsAdder.addArrayElements(myIntArray));

			Board1Client b = new Board1Client();
			b.doSomethingWithStudent();
			b.doSomethingWithFile();
		} else {
			System.out.println("Exiting client program. Thank you!");
		}

	}

	private void doSomethingWithFile() throws IOException {

		FileWriter fileWriter = new FileWriter(new File("D:/students.txt"));
		Student student = new Student("Aashika", "001");
		fileWriter.write(student.getName() + " " + student.getUsn());
		fileWriter.flush();
	}

	private void doSomethingWithStudent() {

		Student student = new Student();
		String name = student.getName();
	}

}
