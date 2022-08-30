package classes.inner_class;

class Main {

    public static void main(String[] args){
        // Create object of the OuterClass
        OuterClass outerClass = new OuterClass();
        // Create object of the InnerClass
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Retrieve attribute x and y
        int sum = outerClass.x + innerClass.y;
        System.out.println("[x + y] = " + sum);
    }
}

// Declaring a class
class OuterClass {
    int x = 4;


    // Class within another class
    // Can be private or protected
    // Can be static
    class InnerClass {
        int y = 6;
    }
}
