package inheritance.interfaces;

class Main {

    // Interface is another way of achieving abstraction
    // To access interface methods we use "implements"
    // Multiple interfaces can be implemented at once

    // [1] Interface methods are by default abstract and public
    // [2] Interface attributes are by default public, static and final
    // [3] An interface cannot contain a constructor (as it cannot be used to create objects)

    public static void main(String[] args){
        // Not possible to create Animal object
        // Create Cat object that implements the interface
        Cat cat = new Cat();

        cat.sleep();            // Implemented from Animal interface
        cat.sound();            // Implemented from Animal interface
        cat.exampleMethod();    // Implemented from SecondInterface interface
    }
}

interface Animal{
    // interface methods cannot have a body
    void sound(); // abstract, public by default
    void sleep(); // abstract, public by default
}

interface SecondInterface {
    void exampleMethod();
}

// implements the interface
class Cat implements Animal, SecondInterface{
    public void sound() {           // implemented from Animal
        System.out.println("Meow");
    }
    public void sleep() {           // implemented from Animal
        System.out.println("ZzzZzZZz");
    }
    public void exampleMethod() {   // implemented from SecondInterface
        System.out.println("Implemented method from second interface");
    }
}
