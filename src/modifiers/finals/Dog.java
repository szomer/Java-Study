package modifiers.finals;

// Dog inherits the properties from Animal class
class Dog extends Animal {

    // Attributes can not be changed after initialization
    final int a = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Dog x = new Dog();
        x.finalVariables();
        x.characteristics();
        x.sound();
    }

    private void finalVariables(){
        // Changing the values of a variable that is final gives an error:
        // a = 12;
        // PI = 3.4;
    }

    // Overriding the method from the parent class gives an error
    // This is because the method is set to final:
//    final void characteristics(){
//
//    }

    private void sound(){
        System.out.println("\nAdditional Characteristics:");
        System.out.println("Sound: Bhow Bhow");
    }

}
