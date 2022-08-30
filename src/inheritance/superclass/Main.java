package inheritance.superclass;

class Main {

    public static void main(String[] args){
        Animal cat = new Cat();
        System.out.println();
        cat.sound();
    }
}

// Superclass
class Animal {

    // Constructor
    public Animal(){
        System.out.println("I am an Animal");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Cat extends Animal {

    // Constructor
    public Cat() {
        // Call constructor of superclass Animal
        super();
        System.out.println("I am a Cat");
    }

    public void sound(){
        // Reference to the superclass Animal
        super.sound();
        System.out.println("Cat makes Meow sound");
    }
}
