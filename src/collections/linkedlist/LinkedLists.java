package collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

class LinkedLists {

    // Elements in the LinkedList are objects
    // Can be of all sorts of data types
    private LinkedList<String> cars;

    public static void main(String[] args){
        LinkedLists x = new LinkedLists();
        x.create();
        x.addFirst();
        x.addLast();
        x.access();
        x.accessFirst();
        x.accessLast();
        x.loop();
        x.size();
        x.update();
        x.sort();
        x.delete();
        x.deleteFirst();
        x.deleteLast();
        x.deleteAll();
    }

    private void create(){
        // Create a LinkedList
        cars = new LinkedList<>();

        // Add elements to the LinkedList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
    }

    private void addFirst(){
        // Add element to the beginning of the list
        cars.addFirst("Kia");
    }

    private void addLast(){
        // Add element to the end of the list
        cars.addLast("Kia");
    }

    private void access() {
        // Access a specified element of the LinkedList
        System.out.println(cars.get(0));
    }

    private void accessFirst(){
        // Get the element at the beginning of the list
        System.out.println(cars.getFirst());
    }

    private void accessLast(){
        // Get the element at the end of the list
        System.out.println(cars.getLast());
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
        // Returns the number of elements in the LinkedList
        System.out.println(cars.size());
    }

    private void update() {
        // Update the element value of index 0
        cars.set(0, "Opel");
    }

    private void sort(){
        // Sorting alphabetically
        Collections.sort(cars);
    }

    private void delete(){
        // Delete the element of index 0
        cars.remove(0);
    }

    private void deleteFirst(){
        // Delete the element at the beginning of the list
        cars.removeFirst();
    }

    private void deleteLast(){
        // Delete the element at the end of the list
        cars.removeLast();
    }

    private void deleteAll(){
        // Delete all elements from the LinkedList
        cars.clear();
    }
}
