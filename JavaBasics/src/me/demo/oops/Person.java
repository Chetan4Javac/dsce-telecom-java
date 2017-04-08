package me.demo.oops;

/**
 * Class to demo constructors
 * 
 * @author Chetan Gorkal
 *
 */
public class Person {

	String name;

	public Person() {
		super();
		System.out.println("In Person default constructor");
	}

	public Person(String name) {
		super();
		this.name = name;
		System.out.println("In Person parameterized constructor");
	}

	public static void main(String[] args) {

		Person demo1 = new Person();
		Person demo2 = new Person("Chetan");

		System.out.println(demo1.name); // null
		System.out.println(demo2.name); // Chetan
	}

}
