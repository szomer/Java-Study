package collections.set;

import java.util.*;

class Sets {

    // Set
    // Collection of unordered elements that cannot contain duplicate elements.
    // Sets can be: HashSet, LinkedHashSet, TreeSet, EnumSet

    private Set<Integer> set;
    private Set<Integer> set2;

    public static void main(String[] args){
        Sets x = new Sets();
        x.create();
        x.union();
        x.intersection();
        x.difference();
        x.access();
        x.loop();
        x.delete();
        x.deleteAll();
    }

    // Create Set
    private void create(){
        // Add elements to Set
        set = new HashSet<>();
        set.add(1); set.add(3); set.add(2); set.add(4);
        set.add(8); set.add(9); set.add(0);

        // Add elements to Set directly
        set2 = new HashSet<>();
        set2.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

        // Print Sets
        System.out.println("Set1: " + set);
        System.out.println("Set2: " + set2);
    }

    // Union Operation
    private void union(){
        // Union of two sets returns all the elements
        Set<Integer> unionSet = new HashSet<>(set);
        unionSet.addAll(set2);

        System.out.println("\nUnion of the 2 sets:");
        System.out.println(unionSet);
    }

    // Intersection Operation
    private void intersection(){
        // Intersection of two sets returns all the common elements
        Set<Integer> intersectionSet = new HashSet<>(set);
        intersectionSet.retainAll(set2);

        System.out.println("\nIntersection of the 2 sets:");
        System.out.println(intersectionSet);
    }

    // Difference Operation
    private void difference(){
        // Difference of two sets returns all elements not in common
        Set<Integer> differenceSet = new HashSet<>(set);
        differenceSet.removeAll(set2);

        System.out.println("\nDifference of the 2 sets:");
        System.out.println(differenceSet);
    }

    // Accessing elements
    private void access(){
        // Returns true if the element exists
        set.contains(3);
    }

    // Iterate over Set
    private void loop(){
        System.out.println("\nSet one contains: ");

        for (Integer value : set) {
            // Printing all the values inside the object
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    // Deleting element
    private void delete(){
        // Removes the element with value 3
        set.remove(3);
    }

    // Deleting all elements
    private void deleteAll(){
        // Removes all elements from the Set
        set.clear();
    }

}
