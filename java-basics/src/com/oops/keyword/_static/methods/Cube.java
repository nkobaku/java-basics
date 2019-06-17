package com.oops.keyword._static.methods;

public class Cube {

	static int calculateCube(int side) {
		return (side * side * side);
	}

	public static void main(String[] args) {

		int x = 5;
		int cube = Cube.calculateCube(x);

		System.out.println("Cube value of 5 is: " + cube);
	}
}