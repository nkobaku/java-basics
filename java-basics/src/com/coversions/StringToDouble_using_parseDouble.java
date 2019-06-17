package com.coversions;
// Double.valueOf(String) returns a new Double object.
public class StringToDouble_using_parseDouble {

	public static void main(String[] args) {
		String str = "3.142";
		double pi = Double.parseDouble(str);
		System.out.println(pi);

	}

}
