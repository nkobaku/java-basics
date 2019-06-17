initially in the main() method, an integer array named �arr� with size 3 is created. Since arrays in java are objects and not primitive types, they are stored in the heap memory as you can see in the diagram. So the reference variable arr does not store the actual values but points to the memory location in the heap memory where the actual array values are being stored. Now when the displayArray() method is called, a new reference variable named � �a� is created in the stack memory, however it still points to the same heap memory location where the original integer array named arr was created. Thus when the values are changed using the a variable in the displayArray() method, by default the values are also changed for arr since both a and arr point to the same memory location where the actual array values are being stored.
Thus from this you can understand the when we pass by reference, the original object values can also be changed in the method.