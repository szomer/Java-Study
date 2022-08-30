package components.expressions;

import java.util.ArrayList;
import java.util.function.Consumer;

class LambdaExpressions {

    public static void main(String[] args){

        // Lambda Expressions
        // A short block of code which takes in parameters and returns a value.
        // Similar to methods, but they do not need a name and they can be implemented right in the body of a method.

        // Syntax
        // parameter -> expression
        // (parameter1, parameter2) -> expression
        // (parameter1, parameter2) -> { code block }


        // Example 1:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        // Example 2:
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        // Example 3:
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

interface StringFunction {
    String run(String str);

}
