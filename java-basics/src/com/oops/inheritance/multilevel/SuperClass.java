package com.oops.inheritance.multilevel;

public class SuperClass {
	public void methodA() {
		System.out.println("SuperClass");
	}

}

class SubClass1 extends SuperClass {

	public void methodB() {
		System.out.println("SubClass1 ");
	}
}

class SubClass2 extends SubClass1 {

	public void methodC() {
		System.out.println("SubClass2");
	}

	public static void main(String args[]) {
		SubClass2 obj = new SubClass2();
		obj.methodA(); // calling super class method
		obj.methodB(); // calling subclass 1 method
		obj.methodC(); // calling own method
	}
}



//output:
/*
 * SuperClass 
 * SubClass1 
 * SubClass2
 */
