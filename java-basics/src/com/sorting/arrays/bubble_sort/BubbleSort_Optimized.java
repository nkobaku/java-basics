package com.sorting.arrays.bubble_sort;
import java.util.Arrays;
 
public class BubbleSort_Optimized {
 
    public void sort(int[] array) {
 
        int arrayLength = array.length;
        for(int i=0;i<arrayLength;i++){
            boolean isSorted = true;
            for( int j=0;j<arrayLength-i-1;j++){
                if(array[j] > array[j+1]){
                    isSorted = false;
                    swap(array,j,j+1);
                }
            }
            if(isSorted){
                System.out.println("Breaking at index : " + i);
                break;
            }
        }
    }
 
    public static void swap(int[] array, int x, int y) {
        array[x] = array[x] + array[y];
       array[y] = array[x] - array[y];
       array[x] = array[x] - array[y];
   }
    
    public static void main(String args[]){
        int[] array = new int[]{2,7,5,9,4,7,1,0,1,2,3,};
        System.out.println("Array Before Sort : " + Arrays.toString(array));
        new BubbleSort_Optimized().sort(array);
        System.out.println("Array after Sort : " + Arrays.toString(array));
    }
 
 
}