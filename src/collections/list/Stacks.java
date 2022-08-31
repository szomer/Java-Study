package collections.list;

import java.util.Iterator;
import java.util.Stack;

class Stacks {
    // Subclass of Vector

    public static void main(String[] args){
        // Create Stack
        Stack<String> stack = new Stack<>();

        // Add items
        stack.push("Hello");
        stack.push("How");
        stack.push("Are");
        stack.push("You");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
