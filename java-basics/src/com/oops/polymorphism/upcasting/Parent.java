package com.oops.polymorphism.upcasting;

//Upcasting is casting a subtype to a supertype, upward to the inheritance tree. 
//Upcasting happens automatically and we don’t have to explicitly do anything. 
// Base Class
class Parent
{
    void show() { System.out.println("Parent's show()"); }
}
// Inherited class
class Child extends Parent
{
    // This method overrides show() of Parent
    @Override
    void show() { System.out.println("Child's show()"); }
}
 
class Main
{
    public static void main(String[] args)
    {
        Parent obj1 = new Child();
        obj1.show();
    }
}


//output: Child’s show()