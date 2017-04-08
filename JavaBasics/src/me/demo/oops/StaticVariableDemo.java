package me.demo.oops;

/**
 * Demo of static variables.<br>
 * Prerequisite: constructors. Refer {@link Person} class
 * 
 * @author Chetan Gorkal
 *
 */
public class StaticVariableDemo {

	// static is an access specifier which makes variable visible at class
	// level.
	// static variables can be accessed without creating an instance of the
	// class
	static int counter;
	int a;

	public StaticVariableDemo() {
		System.out.println("Inside constructor");
		counter++;
		a++;
	}

	public static void main(String[] args) {

		// create an instance of class
		StaticVariableDemo demo1 = new StaticVariableDemo();
		System.out.println("Created 1st instance");
		System.out.println("instances created so far: " + StaticVariableDemo.counter); // 1
		System.out.println("------------------------------------------");

		// a is an instance variable.
		// It cannot be accessed without creating and instance.
		// System.out.println(StaticVariableDemo.a);
		System.out.println("a " + demo1.a);

		// create 2nd instance of the class
		StaticVariableDemo demo2 = new StaticVariableDemo();
		System.out.println("Created 2nd instance");
		System.out.println("instances created so far: " + StaticVariableDemo.counter);// 2
		System.out.println("a " + demo2.a);
		System.out.println("------------------------------------------");

		// create few more instances and observe
		// values of instance variable and static variable.
		StaticVariableDemo demo3 = new StaticVariableDemo();
		System.out.println("Created 3rd instance");
		System.out.println("instances created so far: " + StaticVariableDemo.counter);// 2
		System.out.println("a " + demo3.a);
		System.out.println("------------------------------------------");

		StaticVariableDemo demo4 = new StaticVariableDemo();
		System.out.println("Created 4th instance");
		System.out.println("instances created so far: " + StaticVariableDemo.counter);// 2
		System.out.println("a " + demo4.a);
		System.out.println("------------------------------------------");

		StaticVariableDemo demo5 = new StaticVariableDemo();
		System.out.println("Created 5th instance");
		System.out.println("instances created so far: " + StaticVariableDemo.counter);// 2
		System.out.println("a " + demo5.a);
		System.out.println("------------------------------------------");

	}

}
