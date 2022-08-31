package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {

    // Iterator is an object that can be used to loop through collections.
    // It is called an iterator because "iterating" means looping.


    // ArrayList to store cars
    ArrayList<Integer> cars;

    public static void main(String[] args) {
        Iterators x = new Iterators();
        x.createCollection();
        x.getIterator();
        x.print();
        x.loop();
        x.delete();
    }

    private void createCollection(){
        // Add items to list
        cars = new ArrayList<>();
        cars.add(12);
        cars.add(5);
        cars.add(48);
        cars.add(7);
    }

    private void getIterator(){
        // Get the iterator for ArrayList cars
        Iterator<Integer> it = cars.iterator();
    }

    private void print(){
        Iterator<Integer> it = cars.iterator();
        System.out.println(it.next());
    }

    private void loop(){
        Iterator<Integer> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private void delete(){
        Iterator<Integer> it = cars.iterator();

        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(cars);
    }
}

