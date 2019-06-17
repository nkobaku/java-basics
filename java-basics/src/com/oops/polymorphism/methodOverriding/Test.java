package com.oops.polymorphism.methodOverriding;

public class Test {
	public static void main(String[] args) {
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}


/*
 * Depending on the type of Object (Parent or Child) the respective method
 * show() is being called. Also using the parent object, we have created a
 * reference to the child class (Parent obj2 = new Child()). Thus now the parent
 * object is referring to the child class and hence we are able to access the
 * child class’s show() method.
 */