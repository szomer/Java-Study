package components;

class Methods {
    public static void main(String[] args){
        Methods x = new Methods();
        x.methods();
        x.methodOverloading();
    }

    private void methods(){
        // A method is also known as a Function

        // The method can return values by replacing void keyword and providing a return keyword inside the method.

        // Parameters: is the information that can be passed to a method and act as variables.
        // Scope: Variables are only accessible inside the region (scope) they are created

        // Static:  means that the method belongs to the Main class and not an object of the Main class
        // Void:    means that this method does not have a return value.
    }

    private void methodOverloading(){
        // With method overloading, multiple methods can have the same name with different parameters.

        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    private int plusMethodInt(int x, int y) {
        return x + y;
    }

    private double plusMethodDouble(double x, double y) {
        return x + y;
    }
}
