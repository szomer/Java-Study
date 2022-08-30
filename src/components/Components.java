package components;

class Components {
    private int arr[] = new int[10];
    int result, a, b;
    double c;

    // Operators may be used in building expressions.
    // Expressions are the core components of statements.
    // Statements may be grouped into blocks.

    public static void main(String[] args){
        Components x = new Components();
        x.expressions();
        x.statements();
        x.blocks();
    }

    // Expressions
    private void expressions(){
        // Expression is a construct made up of variables, operators, and method invocations.

        // Example expressions:
        arr[0] = 10;
        a = 5;
        b = 3;
        result = a + b;
    }

    // Statements
    private void statements(){
        // A statement forms a complete unit of execution.
            // [1] Assignment expressions
            // [2] Any use of ++ or --
            // [3] Method invocations
            // [4] Object creation expressions
            // [5] Declaration statements
            // [6] Control flow

        // Example statements:
        c = 8933.3434;                              // assignment statement
        b++;                                        // increment statement
        System.out.println("Hello World!");         // method invocation statement
        Components component = new Components();    // object creation statement
        double x = 8933.234;                        // declaration statement
        if(a > 3){ }                                // control flow statement
    }

    // Blocks
    private void blocks(){
        // A block is a group of 0 or more statements between balanced braces.

        // Example block:

        boolean condition = true;
        if (condition) { // begin block 1
            System.out.println("Condition is true.");
        } // end block 1
        else { // begin block 2
            System.out.println("Condition is false.");
        } // end block 2
    }
}
