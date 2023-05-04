//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;

import java.util.*;



public class Demo {
	// array has some limitations
	// we need size of an array while creating an array
	// if we don't know the size, we should always use arraylist'
	// we need to import arrayList from java.util
    public static void main(String[] args) {
        // Create a new ArrayList
    	
    	
    	
        ArrayList<String> myList = new ArrayList<String>();
        
        // myList is a arrayList name, the name can be anything
    	// this arrayList dataType is String
    	// what is the size of this arrayList ? infinity
    	// we can add as many elements in arrayList as we want 

        // Add some elements to the ArrayList
        myList.add("apple"); 
        myList.add("banana");
        myList.add("orange");

        // Print the size of the ArrayList
        System.out.println("Size of myList: " + myList.size());

        // Print the elements of the ArrayList using a for loop
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Remove an element from the ArrayList
        myList.remove(1);

        // Print the updated ArrayList
        System.out.println("Updated myList: " + myList);
    }
}

