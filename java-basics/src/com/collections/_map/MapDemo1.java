package com.collections._map;
 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Note : Keys in a Map are unique and hence 
// .keySet() will return a set. 
// Two different keys can 
// have same value and hence values can't form a set(Values in a set are unique) 
// and hence what you get from .values() is a Collection.
public class MapDemo1 {
 
    public static void main(String args[]) {
        Map<String, String> persononalData = new HashMap<String, String>();
        // Populating Map with data
        persononalData.put("Name", "John");
        persononalData.put("Country", "USA");
        persononalData.put("Gender", "Male");
        persononalData.put("Age", "18");
        
        //using iterator
        Iterator<Map.Entry<String, String>> mapIterator = 
        		persononalData.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<String, String> keyValuPair = mapIterator.next();
            System.out.println("Key is " + keyValuPair.getKey());
            System.out.println("Value is " + keyValuPair.getValue());
        }
    }
}




//using Map.Entry   for each loop
/*
for (Map.Entry<String, String> keyValuePairs : persononalData
        .entrySet()) {
    System.out.println("Key is " + keyValuePairs.getKey()
            + "and value is " + keyValuePairs.getValue());
}

*/



//iterating only keys:

/*
Iterate over keys : 
    for (String key : persononalData.keySet()) {
        System.out.println("Key is " + key);
    }


*/


//iterating only values:

/*
Iterate over Values : 
    for (String value : persononalData.values()) {
        System.out.println("Values is " + value);
    }


*/