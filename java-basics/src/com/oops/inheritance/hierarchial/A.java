package com.oops.inheritance.hierarchial;

class A {
	public void methodA() {
		System.out.println("Super class method");
	}
}

class B extends A {
	public void methodB() {
		System.out.println("Sub class Method B");
	}
}

class C extends A {
	public void methodC() {
		System.out.println("Sub class Method C");
	}

	public static void main(String args[]) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		obj1.methodA(); // calling super class method
		obj2.methodA(); // calling A method from subclass object
		obj3.methodA(); // calling A method from subclass object
	}
}


/*
 * Output: 
 * Super class method 
 * Super class method 
 * Super class method
 */	
	
	