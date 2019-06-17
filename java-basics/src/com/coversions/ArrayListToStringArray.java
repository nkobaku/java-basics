package com.coversions;

import java.util.ArrayList;
import java.util.List;
//Java – Convert ArrayList<String> to String[]
public class ArrayListToStringArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");

		// default, returns Object[], not what we want,
		// Object[] objects = list.toArray();

		String[] str = list.toArray(new String[0]);

		for (String s : str) {
			System.out.println(s);
		}

	}

}
