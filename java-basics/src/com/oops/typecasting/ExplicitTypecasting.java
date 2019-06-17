package com.oops.typecasting;
//Narrowing or Explicit Type Conversion
//If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.
//This is useful for incompatible data types where automatic conversion cannot be done.
//Here, target-type specifies the desired type to convert the specified value to.
public class ExplicitTypecasting {
	public static void main(String[] args) {
		double d = 100.04;

		// explicit type casting
		long l = (long) d;

		// explicit type casting
		int i = (int) l;
		System.out.println("Double value " + d);

		// fractional part lost
		System.out.println("Long value " + l);

		// fractional part lost
		System.out.println("Int value " + i);
	}
}
