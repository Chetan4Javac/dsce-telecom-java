package me.demo.basicprogramming;

/**
 * Class to demo primitive data types available in Java
 * 
 * @author Chetan Gorkal
 *
 */
public class DataTypesDemo {

	public static void main(String[] args) {

		boolean myBoolean = true; // 1 bit
		byte myByte = 1; // 1 byte, 8 bits
		char myChar = 'c'; // 2 byte, 16 bits
		short myShort = 2048; // 2 byte, 16 bits
		int myInt = 1111111111; // 4 bytes
		long myLong = 2222222222222222222L; // 8 bytes
		float myFloat = 1.11111111111111111111111f;// 4 bytes
		double myDouble = 1.111111111111111111111111111111;// 8 bytes

		System.out.println("myBoolean: " + myBoolean);
		System.out.println("myByte: " + myByte);
		System.out.println("myChar: " + myChar);
		System.out.println("myShort: " + myShort);
		System.out.println("myInt: " + myInt);
		System.out.println("myLong: " + myLong);
		System.out.println("myFloat: " + myFloat);
		System.out.println("myDouble: " + myDouble);
	}

}
