package com.oops.polymorphism.methodoverloading;

//Method Overloading example program code
public class MethodOverloading {

	// 1) 2 arguments int & double
	double add(int x, double y) {
		return (x + y);
	}

	// 2) 2 arguments but different order - double & int
	double add(double x, int y) {
		return (x + y);
	}

	// 3) 3 arguments
	double add(double x, int y, float z) {
		return (x + y + z);
	}

	public static void main(String[] args) {
		// TODO code application logic here
		int a = 5;
		double b = 7.5;
		float c = 4.5f;

		double result;

		MethodOverloading obj = new MethodOverloading();
		result = obj.add(b, a); // 1st add function
		System.out.println("Addtion is: " + result);
		result = obj.add(a, b); // 2nd add function
		System.out.println("Addtion is: " + result);
		result = obj.add(b, a, c); // 3rd add function
		System.out.println("Addtion is: " + result);

	}

}



/*
 * Output 
 * Addtion is: 12.5 
 * Addtion is: 12.5 
 * Addtion is: 17.0
 */