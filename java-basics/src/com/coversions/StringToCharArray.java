package com.coversions;
//use String.toCharArray() to convert a String into a char array.
public class StringToCharArray {

    public static void main(String[] args) {

        String password = "password123";

        char[] passwordInCharArray = password.toCharArray();

        for (char temp : passwordInCharArray) {
            System.out.println(temp);
        }

    }

}