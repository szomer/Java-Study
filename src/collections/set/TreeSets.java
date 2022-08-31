package collections.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class TreeSets {

    // Sorted Tree Set
    // SortedSet<T> ts = new TreeSet<> ();

    public static void main(String[] args){
        // Tree Set
        Set<String> countries = new TreeSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");

        // Adding the duplicate element
        countries.add("India");

        // Print the set
        System.out.println("\nTree Set: " + countries);

        // Remove item from HashSet
        countries.remove("Australia");
        System.out.println("Tree Set after removing Australia: " + countries);

        // Create iterator of set
        Iterator<String> it = countries.iterator();

        System.out.println("Iterating Tree Set:");
        while(it.hasNext()){
            System.out.println("\t" + it.next());
        }
    }
}
