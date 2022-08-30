package modifiers.statics;

class Static {

    public static void main(String[] args) {
        // Static method can be called directly without making object of Main
        staticMethod();         // call static method


        // Private/Public methods can only be called by creating a Main object
        Static aStatic = new Static(); // create Main object
        aStatic.normalMethod();    // call method of Main object

    }

    // Static method
    private static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }


    // Private method
    private void normalMethod(){
        System.out.println("Public/Private methods must be called by creating objects");
    }
}
