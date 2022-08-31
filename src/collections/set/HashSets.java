package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSets {

    private HashSet<String> cars;

    public static void main(String[] args){
        HashSets x = new HashSets();
        x.create();
        x.access();
        x.size();
        x.loop();
        x.delete();
        x.deleteAll();
        x.iterator();
    }

    private void create(){
        // Create a HashSet object called cars
        cars = new HashSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
    }

    private void access(){
        // Check if the HashSet contains a value
        // Returns true or false
        cars.contains("Mazda");
    }

    private void size(){
        // Return the amount of items in the HashSet
        System.out.println(cars.size());
    }

    private void loop(){
        // Loop through the HashSet
        for (String i : cars) {
            System.out.println(i);
        }
    }

    private void delete(){
        // Delete the item with value "Volvo"
        cars.remove("Volvo");
    }

    private void deleteAll(){
        // Delete all items from the HashSet
        cars.clear();
    }

    private void iterator(){
        // Hash Set
        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");

        // Adding the duplicate element
        countries.add("India");

        // Print the set
        System.out.println("\nHash Set: " + countries);

        // Remove item from HashSet
        countries.remove("Australia");
        System.out.println("Hash Set after removing Australia: " + countries);

        // Create iterator of set
        Iterator<String> it = countries.iterator();

        System.out.println("Iterating Hash Set:");
        while(it.hasNext()){
            System.out.println("\t" + it.next());
        }
    }
}