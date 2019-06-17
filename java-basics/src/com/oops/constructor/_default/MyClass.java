package com.oops.constructor._default;
// the default constructor is called when the object is instantiated using 
//the new keyword. Thus the constructor is used to construct the values of objects.
public class MyClass {
	int number;

	public MyClass() {
		System.out.println("Constructor Called");
		number = 5;
	}

	public static void main(String[] args) {

		MyClass obj = new MyClass(); // Constructor Called
		System.out.println("Number value is: " + obj.number);
	}

}


//Output:

//Constructor Called
//Number value is: 5