package datatypes.variables;

class WrapperClass {

    // Java Wrapper Class
    // Provides a way to use primitive data types as objects

    // Primitive data type          Wrapper Class
    // byte                     ->  Byte
    // short                    ->  Short
    // int                      ->  Integer
    // long                     ->  Long
    // float                    ->  Float
    // double                   ->  Double
    // boolean                  ->  Boolean
    // char                     ->  Character

    public static void main(String[] args){
        // Create wrapper objects
        Integer     myInt       = 5;
        Double      myDouble    = 5.99d;
        Character   myChar      = 'A';

        // Get specific information about the objects
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString() method used to convert wrapper objects to strings
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
