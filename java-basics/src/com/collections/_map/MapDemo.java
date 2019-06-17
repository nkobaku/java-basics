package com.collections._map;
import java.util.HashMap;
import java.util.Map;
 
public class MapDemo {
 
    public static void main(String args[]) {
        Map<String, String> persononalData = new HashMap<String, String>();
        // Populating Map with data
        persononalData.put("Name", "John");
        persononalData.put("Country", "USA");
        persononalData.put("Gender", "Male");
        persononalData.put("Age", "18");
        // Printing Map
        System.out.println("Map is " + persononalData);
        // removing data from Map
        persononalData.remove("Gender");
        // Printing Map
        System.out.println("Map is " + persononalData);
        if (Integer.valueOf(persononalData.get("Age")) < 18) {
            System.out.println("You are a minor");
        } else {
            System.out.println("You are a Major");
        }
    }
}
/*
Note : All keys in the Map must be Unique i.e you cannot store two different values
for the same key. Lets say you do someMap.put("Name","John") and then again you say 
someMap.put("Name","Sam") then Sam will overwrite John and when you extract data by 
get("Name") you will get Sam and not John.

Next we extract age of the person using .get("Age") method. 
Note this will return you a String. But for comparison purpose you need 
an integer and hence we convert String to an int using 
Integer.ValueOf(SomeString) method.In our case age is 18 and 
hence age<18 will evaluate to be false and else part will get executed. 


*/