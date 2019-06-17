package com.oops.keyword._final;

public class TryingToOverrideFinalClass {
}

final class Parent
{
     // methods and fields
}
// The following class is illegal.
class Child extends Parent
{ 
    // COMPILE-ERROR! Can't subclass A
}


//Exception: The type Child cannot subclass the final class Parent