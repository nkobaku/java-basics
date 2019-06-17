package com.coversions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


/**
 * Java Program to remove repeated elements from ArrayList in Java.
 *
 */

public class ArrayListDuplicateDemo{
 
   
    public static void main(String args[]){
   
        // creating ArrayList with duplicate elements
        List<Integer> listWithDuplicates = new ArrayList<Integer>();
       
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(5);
        listWithDuplicates.add(7);  //duplicate
        listWithDuplicates.add(7);
        listWithDuplicates.add(11);
       
        // let's print arraylist with duplicate
        System.out.println("listWithDuplicates : " + listWithDuplicates);
       
        // Now let's remove duplicate element without affecting order
        // LinkedHashSet will guaranteed the order and since it's set
        // it will not allow us to insert duplicates.
        // repeated elements will automatically filtered.
       
        Set<Integer> listWithoutDuplicates = new LinkedHashSet<Integer>(listWithDuplicates);
       
        // now let's clear the ArrayList so that we can copy all elements from LinkedHashSet
        listWithDuplicates.clear();
       
        // copying elements but without any duplicates
        listWithDuplicates.addAll(listWithoutDuplicates);
       
        System.out.println("list without duplicates : " + listWithDuplicates);
       
    }
 
}

//Output
//list of prime numbers : [2, 3, 5, 7, 7, 11]
//list of primes without duplicates : [2, 3, 5, 7, 11]