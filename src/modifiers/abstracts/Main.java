package modifiers.abstracts;

class Main {
    // Abstraction is a process of hiding the implementation details and showing only functionality to the user
    // Abstraction is achieved by abstract class of interface

    // Abstract class:
        // can contain abstract and non-abstract methods
        // can not be instantiated
        // can have constructor and static methods
        // can have final methods

    public static void main(String[] args){
        Shape shape1 = new Circle();
        shape1.run();
        shape1.draw();

        Shape shape2 = new Rectangle();
        shape2.run();
        shape2.draw();
    }
}

abstract class Shape {
    // abstract method does not have implementation
    abstract void draw();

    // non-abstract method
    void run() {
        System.out.println("Waiting for shape to be drawn...");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("Drawing circle");
    }
}