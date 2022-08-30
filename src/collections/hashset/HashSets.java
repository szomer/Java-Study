package collections.hashset;

import java.util.HashSet;

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
}