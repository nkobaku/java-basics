package com.oops.constructor._parameterized;

/*the parameterized constructor is called when we pass a value in the opening 
 * and closing parathesis. Since our parameterized constructor in this example 
 * takes in 1 int value as argument, we have to pass 1 integer value during 
 * the object intialization in order to invoke the parameterized constructor.*/
public class MyClass {
	int number;

	public MyClass(int x) {
		System.out.println("Parameterized Constructor Called");
		number = x;
	}

	public static void main(String[] args) {
		//MyClass obj = new MyClass(); //Compile time error: The constructor MyClass() is undefined
		//you have not specified a default no args constructor. This the reason why you get that error. When while creating the object in the main function 
		
		
		MyClass obj = new MyClass(4); // Parameterized Constructor Called
		System.out.println("Number value is: " + obj.number);
		
		/*
		 * I have implemented parameterized constructor with int parameter), then you
		 * don’t receive the default constructor by compiler into your code. If we
		 * remove the parameterized constructor from the above code then the program
		 * would run fine, because then compiler would insert the default constructor
		 * into your code.
		 */
	}
}


//output:

//Parameterized Constructor Called
//Number value is: 4