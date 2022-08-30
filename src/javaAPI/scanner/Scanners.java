package javaAPI.scanner;

import java.util.Scanner;

class Scanners {

    // Scanner object
    private Scanner scanner;

    public static void main(String[] args) {
        Scanners x = new Scanners();
        x.readInput();
    }

    private void readInput(){
        // Initialize scanner object
        scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // Read user input
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);

        // Input types:
            // scanner.nextBoolean()    reads a boolean value from the user
            // scanner.nextByte()       reads a byte value from the user
            // scanner.nextDouble()     reads a double value from the user
            // scanner.nextFloat()      reads a float value from the user
            // scanner.nextInt()        reads an int value from the user
            // scanner.nextLine()       reads a String value from the user
            // scanner.nextLong()       reads a long value from the user
            // scanner.nextShort()      reads a short value from the user
    }
}
