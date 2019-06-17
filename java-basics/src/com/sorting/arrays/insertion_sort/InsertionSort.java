package com.sorting.arrays.insertion_sort;

import java.util.Arrays;

//Insertion sort iterates, consuming one input element each repetition, 
// and growing a sorted output list. Each iteration, 
// insertion sort removes one element from the input data, 
// finds the location it belongs within the sorted list, 
// and inserts it there. It repeats until no input elements remain.

// At any iteration i, elements 0 to i-1 will be sorted and 
// with each increment in i previous list of sorted elements will grow.
public class InsertionSort {
 
 
    public void sort(int[] array) {
        for(int i=1;i<array.length;i++){
            int j = i;
            while(j>0 && array[j-1]>array[j]){
                swap(array,j-1,j);
                j--;
            }
        }
 
    }
 
    public static void swap(int[] array, int x, int y) {
        array[x] = array[x] + array[y];
       array[y] = array[x] - array[y];
       array[x] = array[x] - array[y];
   }
    
    public static void main(String args[]){
 
        int[] array = new int[]{2,7,5,9,4,7,1,0};
        System.out.println("Array Before Sort : " + Arrays.toString(array));
        new InsertionSort().sort(array);
        System.out.println("Array after Sort : " + Arrays.toString(array));
 
    }
}
















/*
A slightly better version would be where you don't have to swap numbers every time -

public static int[] sort(int[] array) {
    
    for(int i=1; i <array.length; i++) {
        int key = array[i];
        int j = i - 1;
        while(j>=0 && array[j] > key ) {
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = key;
    }
    return array;
}

*/