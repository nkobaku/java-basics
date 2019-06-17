package com.oops.typecasting;

//Widening or Automatic Type Conversion
//1. The two data types are compatible.
//2.When we assign value of a smaller data type to a bigger data type.
public class ImplicitTypecasting {
	public static void main(String[] args) {
		int i = 100;

		// automatic type conversion
		long l = i;

		// automatic type conversion
		float f = l;
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
	}
}
