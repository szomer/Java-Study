package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSets {

    public static void main(String[] args){
        // Linked Hash Set
        Set<String> countries = new LinkedHashSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");

        // Adding the duplicate element
        countries.add("India");

        // Print the set
        System.out.println("\nLinked Hash Set: " + countries);

        // Remove item from HashSet
        countries.remove("Australia");
        System.out.println("Linked Hash Set after removing Australia: " + countries);

        // Create iterator of set
        Iterator<String> it = countries.iterator();

        System.out.println("Iterating Linked Hash Set:");
        while(it.hasNext()){
            System.out.println("\t" + it.next());
        }
    }
}
