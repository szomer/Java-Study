package inheritance.polymorphism;

class Main {

    // Polymorphism:
    // means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal duck = new Duck();
        Animal pig = new Pig();

        animal.sound();
        cat.sound();
        duck.sound();
        pig.sound();
    }
}

class Animal {
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    public void sound(){
        System.out.println("Meow");
    }
}

class Duck extends Animal {
    public void sound(){
        System.out.println("Quack");
    }
}

class Pig extends Animal {
    public void sound(){
        System.out.println("Quack");
    }
}