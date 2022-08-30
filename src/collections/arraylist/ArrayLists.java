package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {

    // Elements in the ArrayList are objects
    // Can be of all sorts of data types
    private ArrayList<String> cars;

    public static void main(String[] args){
        ArrayLists x = new ArrayLists();
        x.create();
        x.access();
        x.loop();
        x.size();
        x.update();
        x.sort();
        x.delete();
        x.deleteAll();
    }

    private void create(){
        // Create an ArrayList
        cars = new ArrayList<>();

        // Add elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }

    private void access() {
        // Access a specified element of the ArrayList
        System.out.println(cars.get(0));
    }

    private void loop(){
        // for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // for each loop
        for (String i : cars) {
            System.out.println(i);
        }
    }

    private void size(){
        // Returns the number of elements in the ArrayList
        System.out.println(cars.size());
    }

    private void update() {
        // Update the element value of index 0
        cars.set(0, "Opel");
    }

    private void sort(){
        // Sorting alphabetically
        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }
    }

    private void delete(){
        // Delete the element of index 0
        cars.remove(0);
    }

    private void deleteAll(){
        // Delete all elements from the ArrayList
        cars.clear();
    }
}
