package inheritance.abstracts;

class Main {
    // Abstraction is a process of hiding the implementation details and showing only functionality to the user
    // Abstraction is achieved by abstract class of interface
    // To access abstract methods we use "extends"

    // Abstract class:
    // can contain abstract and non-abstract methods
    // can not be instantiated
    // can have constructor and static methods
    // can have final methods

    public static void main(String[] args){
        // Not possible to create Animal object
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}

abstract class Animal {
    abstract void sound(); // Abstract method cannot have a body
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
