package com.oops.wrapper;
//Automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. 
//For example – conversion of int to Integer, long to Long, double to Double etc.
public class Autoboxing {
	public static void main(String args[]) {
		int a = 20;
		Integer i = a;// converting int into Integer
		Integer j = new Integer(10);
		System.out.println(a + " " + i + " " + j);
	}
}
