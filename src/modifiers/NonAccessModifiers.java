package modifiers;

// https://www.w3schools.com/java/java_modifiers.asp
class NonAccessModifiers {
    // Non-Access Modifiers do not control access level, but provides other functionality

    public static void main(String[] args){
        NonAccessModifiers x = new NonAccessModifiers();
        x.classes();
        x.attributesMethods();
    }

    private void classes(){
        // Non-Access modifiers for classes can be:
        // [1] final            The class cannot be inherited by other classes

        // [2] abstract         The class cannot be used to create objects. To access an abstract class,
        //                      it must be inherited from another class

        // [1] final class className() { ... }          -> final
        // [2] abstract class className() { ... }       -> abstract
    }

    private void attributesMethods() {
        // Non-Access modifiers for Attributes, Methods can be:
        // [1] final            Attributes and methods cannot be overridden/modified

        // [2] static           Attributes and methods belongs to the class, rather than an object

        // [3] abstract         Can only be used in an abstract class, and can only be used on methods. The method
        //                      does not have a body. The body is provided by the subclass (inherited from)

        // [4] transient        Attributes and methods are skipped when serializing the object containing them

        // [5] synchronized     Methods can only be accessed by one thread at a time

        // [6] volatile         The value of an attribute is not cached thread-locally, and is always read from
        //                      the "main memory"

        // [1] final int x = "10"
        // [2] private String color =  "red";
        // [3] String color = "red";
        // [4] protected String color = "red";
    }
}
