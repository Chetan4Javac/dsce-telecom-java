package me.demo.basicprogramming;

/**
 * Class to demo variable declaration and initialization, conditional
 * statements.
 * 
 * @author Chetan Gorkal
 *
 */
public class VariablesDemo {

	// single line comment.
	/*
	 * Multiple lines comment
	 */
	public static void main(String[] args) {
		int a; // variable declaration. Here a is called as the identifier.
		a = 1;// variable initialization

		// conditional statement
		if (a == 1 /* logical expression */) {
			// variable b declared inside if block.
			int b = 2; // in line variable declaration and initialization.
			System.out.println("b: " + b);
		}
		// Scope of variable b is limited to the if block where it is declared.
		// System.out.println(b);
	}

}
