package com.oops.wrapper;
//Converting an object of a wrapper class to its corresponding primitive type is known as unboxing.
public class Unboxing{

    public static void main(String[] args) 
    {
        Character ch = 'a';
        // unboxing - Character object to primitive conversion
        char a = ch; 
        System.out.println("Character ch: "+ch);
        System.out.println("char a: "+a);
    }
}