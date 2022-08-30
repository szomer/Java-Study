package components.keywords;

class InstanceOf {

    // instanceof is used to check if an object is an instance of a specified class

    public static void main(String[] args){

        // Create an instance of this class
        InstanceOf obj = new InstanceOf();
        // Create random object
        Object obj2 = new Object();

        // Returns true if the object is an instance of a specified class
        System.out.println(obj instanceof InstanceOf);  // true
        System.out.println(obj2 instanceof InstanceOf); // false
    }
}
