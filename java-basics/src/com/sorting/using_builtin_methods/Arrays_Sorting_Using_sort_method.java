package com.sorting.using_builtin_methods;
// A sample Java program to sort an array 
// in descending order using Arrays.sort(). 
import java.util.Arrays; 
import java.util.Collections; 

public class Arrays_Sorting_Using_sort_method { 
	public static void main(String[] args) 
	{ 
		// Note that we have Integer here instead of 
		// int[] as Collections.reverseOrder doesn't 
		// work for primitive types. 
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; 

		//1. DEFAULT ASCENDING ORDER	
		//Arrays.sort(arr);  
		
		
		//2.Descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Modified arr[] : %s", Arrays.toString(arr)); 
	} 
} 


//output:
//Modified arr[] : [100, 45, 21, 13, 9, 7, 6, 2]