package methods.exceptions;

class TryCatch {

    // try:         allows you to define a block of code to be tested for errors while it is being executed.
    // catch:       allows you to define a block of code to be executed, if an error occurs in the try block.
    // finally:     lets you execute code regardless of the occurrence of an exception.
    // throw:       allows for the creation of a custom error.

    public static void main(String[] args) {

        try { // try to execute the following code
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);

        } catch (Exception e) { // error occurred while executing
            // create custom error message
            throw new ArrayIndexOutOfBoundsException("Custom Error Message !");

        } finally { // execute the following code regardless
            System.out.println("The 'try catch' is finished.");
        }
    }
}
