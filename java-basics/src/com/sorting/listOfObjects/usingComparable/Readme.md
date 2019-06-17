#Comparable in Java


Comparable in Java is an interface, which was coming from java.lang package.

If any class includes Comparable interface then group of that Objects can be arranged automatically using either Arrays.sort() or Collection.sort(). 


Object will be arranged depending upon the compareTo method available in implemented class. 

Objects that includes comparable in java can be employed as a keys in a SortedSet like TreeSet or SortedMap like TreeMap without including any other interface.

##Methods in Comparable Interface


#public int compareTo(Object o);

The method compares the object for the specified object for order. It returns the below values when comparing the object.

In the case of first element less than of second element  it returns   "-1";

In the case of first element equals to second element, it returns   "0";


In the case of first element greater than of second element, it returns   "1";