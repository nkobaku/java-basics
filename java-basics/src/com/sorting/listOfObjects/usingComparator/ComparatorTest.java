package com.sorting.listOfObjects.usingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "ChandraShekhar", 24, "M"));
		list.add(new Student(102, "John", 35, "M"));
		list.add(new Student(103, "Smith", 30, "M"));
		list.add(new Student(104, "Joi", 23, "F"));

		System.out.println("************Before sorting*****************");
		printList(list);

		System.out.println("************After sorting By RollNo*****************");
		// Using NameComparator to sort the elements
		Collections.sort(list, new AscendingStudentComparator());
		printList(list);

		System.out.println("************After sorting By Name*****************");
		// Using NameComparator to sort the elements
		Collections.sort(list, new NameComparator());
		printList(list);

		System.out.println("************After sorting By AGE*****************");
		Collections.sort(list, new AgeComparator());
		printList(list);
	}

	private static void printList(List<Student> list) {
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
}