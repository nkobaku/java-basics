package com.oops.keyword._static;

public class Cube {

	int side;
	static int objectCount = 0;

	Cube() {
		objectCount++;
	}

	Cube(int x) {
		side = x;
		objectCount++;
	}

	public static void main(String[] args) {
		// TODO code application logic here

		Cube c1 = new Cube(5);
		Cube c2 = new Cube(8);
		Cube c3 = new Cube(10);

		System.out.println("Number of Cube Objects: " + objectCount);
	}

}