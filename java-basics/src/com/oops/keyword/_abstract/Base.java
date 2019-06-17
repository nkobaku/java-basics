package com.oops.keyword._abstract;
//Important Points about Abstract Classes & Abstract Methods in Java

//1. In Java, an instance of an abstract class cannot be created, 
//we can have references of abstract class type though.

//2. An abstract class can contain constructors in Java. 
//And a constructor of abstract class is called when an instance 
//of a inherited class is created.

//3. we can have an abstract class without any abstract method. 
//This allows us to create classes that cannot be instantiated, 
// but can only be inherited.

//4. Abstract classes can also have final methods (methods that cannot be overridden).

//5. If there is any abstract method in a class, that class must be abstract.

//6.If you are extending any abstract class that have abstract method, you must either provide the implementation of the method or make this class abstract.

abstract class Base {
	Base() { System.out.println("Base Constructor Called"); }
	final void dance() { System.out.println("base dance() called"); } // An abstract class with a final method
	abstract void fun();
}

class Derived extends Base {
	Derived() { System.out.println("Derived Constructor Called"); }
	void fun() {
		System.out.println("Derived fun() called");
	}
}

class Main {
	public static void main(String args[]) {

		// Uncommenting the following line will cause compiler error as the
		// line tries to create an instance of abstract class.
		// Base b = new Base();

		// We can have references of Base type.
		Base b = new Derived();
		b.fun();
	}
}


//output: 
/*
 * Base Constructor Called 
 * Derived Constructor Called
 * Derived fun() called
 */