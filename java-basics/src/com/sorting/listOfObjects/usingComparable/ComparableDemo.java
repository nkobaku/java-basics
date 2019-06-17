package com.sorting.listOfObjects.usingComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
 
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
 
        list.add(new Student(101,"ChandraShekhar", 24, "M"));
        list.add(new Student(102, "John", 35, "M"));
        list.add(new Student(103, "Smith",30, "M"));
        list.add(new Student(104, "Joi", 23, "F"));
        
        System.out.println("************Before sorting*****************");
        
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
     
        //Collections.sort expects java.lang.Comparable 
        Collections.sort(list);
        
        
        System.out.println("************After sorting*****************");
        
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }
    }
}