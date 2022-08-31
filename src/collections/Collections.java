package collections;

import java.util.*;

class Collections {
    public static void main(String[] args){
        Collections x = new Collections();
        x.arrays();
        x.collections();
        x.collectionsExample();
        x.mapExamples();
    }

    // Collection:          is any data structure that can hold zero or more data items. Generally, the data
    //                      items will be of the same type or, in languages supporting inheritance, derived from
    //                      some common ancestor type. Collections can utilize certain data structures, such as
    //                      Hash Tables and Balanced Binary Trees, to improve their memory and performance
    //                      characteristics.

    // Data Structure:      is any structure that holds data. Data Structures are distinguished from each other
    //                      by their memory usage and performance characteristics. For example, the lookup
    //                      performance of a Hash Table is O(1), while that of a balanced binary tree is O(log n).


    // Types of datastructures:
    // [1] Linear           ->  Arranged in sequence, one after another
    // [2] Non-Linear       ->  Not in any sequence, connected to 1 or more elements

    private void arrays(){
        // array
        int[] arr;

        // multidimensional array
        int[][] arrMulti;
    }

    private void collections() {
        // COLLECTION FRAMEWORK:

        // COLLECTION
            // Interfaces
            //      [1] Set
            //      [2] List
            //      [3] Deque
            //      [4] Queue

            // Classes
            //      [1] LinkedHashSet
            //      [2] HashSet
            //      [3] TreeSet
            //      [4] ArrayList
            //      [5] Vector
            //          <- Stack
            //      [6] LinkedList
            //      [7] ArrayDeque
            //      [8] PriorityQueue

        // MAP
            // Interfaces
            //      [1] Map

            // Classes
            //      [1] AbstractMap
            //          <- EnumMap
            //          <- HashMap
            //      [2] TreeMap
    }

    private void collectionsExample(){
        // Set examples
        Set<String> hs          = new HashSet<>();
        Set<String> ls          = new LinkedHashSet<>();
        Set<String> ts          = new TreeSet<>();

        // List examples
        List<String> al         = new ArrayList<>();
        List<String> ll         = new LinkedList<>();
        List<String> v          = new Vector<>();
        Stack<String> st        = new Stack<>();

        // Deque examples
        Deque<String> dll       = new LinkedList<>();
        Deque<String> dad       = new ArrayDeque<>();

        // Queue examples
        Queue<String> pq        = new PriorityQueue<>();
    }

    private void mapExamples(){
        // Map examples
        Map<String, String> sm  = new HashMap<>();
        Map<String, String> tm  = new TreeMap<>();
    }
}
