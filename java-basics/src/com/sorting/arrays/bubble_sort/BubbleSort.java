package com.sorting.arrays.bubble_sort;
import java.util.Arrays;
//In bubble sort the largest elements goes to the end of the array and
// the remaining array (0 - array.length-i) is sorted again. 
// It's like a bubble where on each iteration largest element 
// goes to the end. 
public class BubbleSort {
 
    public void sort(int[] array) {
 
        int arrayLength = array.length;
        for(int i=0;i<arrayLength;i++){
            for( int j=0;j<arrayLength-i-1;j++){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
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
        new BubbleSort().sort(array);
        System.out.println("Array after Sort : " + Arrays.toString(array));
 
    }
 
}






//Complexity
//Bubble sort has worst-case and average complexity both O(n2), where n is the number of items being sorted.