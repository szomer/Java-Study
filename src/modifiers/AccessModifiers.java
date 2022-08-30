package modifiers;

// https://www.w3schools.com/java/java_modifiers.asp
class AccessModifiers {
    // Access Modifiers control the access level

    public static void main(String[] args){
        AccessModifiers x = new AccessModifiers();
        x.classes();
        x.attributesMethodsConstructors();
    }

    private void classes(){
        // Access modifiers for classes can be:
        // [1] public       The class is accessible by any other class

        // [2] default      The class is only accessible by classes in the same package.
        //                  This is used when no modifier is specified.

        // [1] public class className() { ... }         -> public
        // [2] class className() { ... }                -> default
    }

    private void attributesMethodsConstructors(){
        // Access modifiers for Attributes, Methods, Constructors can be:
        // [1] public       The code is accessible for all classes

        // [2] private      The code is only accessible within the declared class

        // [3] default      The code is only accessible in the same package.
        //                  This is used when no modifier is specified.

        // [4] protected    The code is accessible in the same package and subclasses


        // [1] public Sting color = "red";
        // [2] private String color =  "red";
        // [3] String color = "red";
        // [4] protected String color = "red";
    }
 }
