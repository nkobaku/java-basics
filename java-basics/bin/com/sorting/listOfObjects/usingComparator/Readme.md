

Comparator in Java is an interface, which was coming from java.util package, used to ordering the collection of objects.

In order to compare the set of elements in an object , The comparator provides the multiple sorting sequences. Hence we can sort the object based on any property.



#Methods in Comparator
##public int compare(Object o1,Object o2);

The method comparing the two arguments and returns the below values.

* In the case of first element less than of second element  it returns   “-1”;
* In the case of first element equals to second element, it returns   “0”;
* In the case of first element greater than of second element, it returns   “1”;
