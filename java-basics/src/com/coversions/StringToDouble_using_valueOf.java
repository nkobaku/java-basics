package com.coversions;
//Double.parseDouble(String) returns a primitive double;
public class StringToDouble_using_valueOf {

	public static void main(String[] args) {
		String str = "3.142";
		Double pi = Double.valueOf(str);
		System.out.println(pi);

	}

}
