package classes.enum_class;

class Main {
    public static void main(String[] args) {

        // Loop through the enum
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

        // The variable "myVar" is set to the constant MEDIUM of enum "Level"
        Level myVar = Level.MEDIUM;
        System.out.println();

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}

// enum is a special class that represents a group of constants (unchangeable variables)
// The constants should be uppercase
// enums can be outside or inside a class
enum Level {
    LOW,        // public, static, final
    MEDIUM,     // public, static, final
    HIGH        // public, static, final
}