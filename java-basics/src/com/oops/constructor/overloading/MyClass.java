package com.oops.constructor.overloading;

public class MyClass {

	int num1;
	double num2;

	// Default Constructor
	public MyClass() {
		System.out.println("Default Constructor Called");
		num1 = 1;
		num2 = 1.5;
	}

	// Parameterized Constructor 1
	public MyClass(int x) {
		System.out.println("Parameterized Constructor 1 Called");
		num1 = x;
	}

	// Parameterized Constructor 2
	public MyClass(int x, double z) {
		System.out.println("Parameterized Constructor 2 Called");
		num1 = x;
		num2 = z;
	}

	void displayData() {
		System.out.println("Num1: " + num1 + "\nNum2: " + num2);
	}

	public static void main(String[] args) {

		MyClass obj1 = new MyClass(); // Default Constructor Called
		obj1.displayData();
		MyClass obj2 = new MyClass(5); // Parameterized Constructor 1 Called
		obj2.displayData();
		MyClass obj3 = new MyClass(5, 5.5); // Parameterized Constructor 2 Called
		obj3.displayData();
	}
}

//we have 3 constructors – 1 default and 2 parameterized, thus we have achieved constructor overloading.

/*
Output
Default Constructor Called
Num1: 1
Num2: 1.5
Parameterized Constructor 1 Called
Num1: 5
Num2: 0.0
Parameterized Constructor 2 Called
Num1: 5
Num2: 5.5
Simple Snippets
*/