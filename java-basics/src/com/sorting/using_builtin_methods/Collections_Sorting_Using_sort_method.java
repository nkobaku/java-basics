package com.sorting.using_builtin_methods;
// Java program to demonstrate working of Collections.sort() 
// to descending order. 
import java.util.*; 

public class Collections_Sorting_Using_sort_method { 
	public static void main(String[] args) 
	{ 
		// Create a list of strings 
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("Geeks For Geeks"); 
		al.add("Friends"); 
		al.add("Dear"); 
		al.add("Is"); 
		al.add("Superb"); 

		/* Collections.sort method is sorting the elements of ArrayList in ascending order. */
		
		//1. Ascending order
		//Collections.sort(al);
		
		//2.Descending Order
		Collections.sort(al, Collections.reverseOrder()); 

		// Let us print the sorted list 
		System.out.println("List after the use of"
						+ " Collection.sort() :\n" + al); 
	} 
} 
