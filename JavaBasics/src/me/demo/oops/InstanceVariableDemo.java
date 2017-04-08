package me.demo.oops;

/**
 * Class to demo instance variables of a class
 * 
 * @author Chetan Gorkal
 *
 */
public class InstanceVariableDemo {

	// This is an instance variable. Unless we do not create an instance of the
	// class, we cannot use this variable.
	int myIntInstanceVariable;

	String myStringInstanceVariable;

	public static void main(String[] args) {
		// local variable. This is visible only in this method.
		// No need to create an instance of the class to use this.
		int myMainMethodLocalVariable = 1;
		System.out.println("myMainMethodLocalVariable" + myMainMethodLocalVariable);

		// create instance of InstanceVariableDemo class using new keyword
		InstanceVariableDemo demo = new InstanceVariableDemo();
		demo.myIntInstanceVariable = 1;
		System.out.println("myIntInstanceVar: " + demo.myIntInstanceVariable);

		// It's not possible to access instance variable directly as below
		// System.out.println(myIntInstanceVar);

		demo.myStringInstanceVariable = "stringValue";
		System.out.println(demo.myStringInstanceVariable);
	}

}
