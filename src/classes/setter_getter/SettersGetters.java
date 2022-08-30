package classes.setter_getter;

import java.util.ArrayList;
import java.util.List;

class SettersGetters {

    public static void main(String[] args){
        SettersGetters x = new SettersGetters();
        x.CreateInstances();
        x.ClassObjects();
    }

    public void CreateInstances(){
        // Create Car instances
        Car car1 = new Car("BMW", 5, "green");
        Car car2 = new Car("Volvo", 3, "black");

        // Change/Set an attribute
        car1.setColor("Grey");

        // Retrieve the value of an attribute
        System.out.println("The color of car2 is: " + car2.getColor());

        // Print the attributes of instances of Car
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }

    public void ClassObjects(){
        // Create a list that stores Car objects/instances
        List<Car> carList = new ArrayList<>();

        // Add Car objects to the list
        carList.add(new Car("BMW", 5, "green"));
        carList.add(new Car("Volvo", 3, "black"));

        // Print the content of the ArrayList
        for (Car car : carList){
            System.out.println(car);
        }
    }
}
