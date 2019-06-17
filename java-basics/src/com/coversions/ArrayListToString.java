package com.coversions;

import java.util.ArrayList;

/**
 *
 * Java program to convert ArrayList to String in Java using for-each loop
 * 
 */
public class ArrayListToString {

  
    public static void main(String args[]) {

        // ArrayList to be converted into String
        ArrayList<String> language = new ArrayList<String>();
        language.add("HashSet");
        language.add("LinkedList");
        language.add("Vector");
      
        // Converting ArrayList to String in Java using advanced for-each loop
        StringBuilder builder  = new StringBuilder();
        for(String str : language){
        	builder .append(str).append(";"); //separating contents using semi colon
        }
      
     // Remove last delimiter with setLength.
        builder.setLength(builder.length() - 1);
        String strfromArrayList = builder.toString();
        System.out.println("String created from ArrayList in Java using for-each loop : " + strfromArrayList);
    }
}

//Output:
//String created from ArrayList in Java using for-each loop : HashSet;LinkedList;Vector;