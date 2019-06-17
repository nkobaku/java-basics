package com.oops.keyword._final;

public class TryingToOverrideFinalMethods {
}
class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}
 
class B extends A 
{
    void m1()
    { 
        // COMPILE-ERROR! Can't override.
        System.out.println("Illegal!");
    }
}
//output: Compile time error
/*
 * Exception: com.oops.keyword._final.A.m1 - Cannot override the final method from A
 */