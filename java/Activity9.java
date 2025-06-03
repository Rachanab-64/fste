package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> myList = new ArrayList<String>();

        // Add 5 names
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eva");
        myList.add("SRS");

        // Print all names
        System.out.println("Names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Retrieve 3rd name (index 2)
        System.out.println("3rd name: " + myList.get(2));
        System.out.println("6th name: " + myList.get(5));

        // Check if a name exists
        System.out.println("Does list contain 'Bob'? " + myList.contains("Bob"));

        // Print size
        System.out.println("Size of list: " + myList.size());

        // Remove a name
        myList.remove("Charlie");

        // Print size again
        System.out.println("Size after removal: " + myList.size());
        
    }
}

