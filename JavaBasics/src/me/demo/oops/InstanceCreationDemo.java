package me.demo.oops;

/**
 * Class to demo creation of instances of a class
 * 
 * @author Chetan Gorkal
 *
 */
public class InstanceCreationDemo {

	public static void main(String[] args) {
		// Creating instance of a class. Use new keyword
		InstanceCreationDemo demo = new InstanceCreationDemo();
		// InstanceCreationDemo is a class. demo is an instance of the class.
		demo.myFirstJavaFunction();

		// variable c is declared inside myFirstJavaFunction() method.
		// It is not visible here
		// System.out.println(c);

	}

	private void myFirstJavaFunction() {
		System.out.println("In myFirstJavaFunction()");
		// c is declared inside this method.
		// It cannot be accessed outside the method.
		int c = 5;
		System.out.println(c);
	}

}
