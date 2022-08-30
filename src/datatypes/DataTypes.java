package datatypes;

class DataTypes implements Calc {

    public static void main(String[] args){
        DataTypes x = new DataTypes();
        x.primitive();
        x.nonPrimitive();
    }

    private void primitive(){
        // Primitive Data Types (Predefined)

        byte v1 = 100;          // 1 byte   -> whole numbers from -128 to 127
        short v2 = 1000;        // 2 bytes  -> whole numbers from -32.768 to 32.767
        int v3 = 10000;         // 4 bytes  -> whole numbers from -2.147.483.648 to 2.147.483.647
        long v4 = 100000;       // 8 bytes  -> whole numbers from -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807
        float v5 = 1.99f;       // 4 bytes  -> fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double v6 = 10.99d;     // 8 bytes  -> fractional numbers. Sufficient for storing 15 decimal digits
        boolean v7 = true;      // 1 bit    -> true or false values
        char v8 = 'A';          // 2 bytes  -> a single character/letter or ASCII values
    }


    private void nonPrimitive(){
        // Unlike primitive data types, these are not predefined. These are user-defined data types created by programmers.
        // These data types are used to store multiple values.

        // Whenever a non-primitive data type is defined, it refers a memory location where the data is stored in heap
        // memory i.e., it refers to the memory location where an object is placed. Therefore, a non-primitive data
        // type variable is also called referenced data type or simply object reference variable.

        // Non-primitive Data Types (Not Predefined)
            // [1] Class
            // [2] Object
            // [3] String
            // [4] Array
            // [5] Interface


        // Class Object [1 & 2]
        DataTypes dt1 = new DataTypes();

        // String [3]
        String str = "This is some string";

        // Array [4]
        int [] arr = {1, 2, 3, 4, 5};

        // Interface [5]
        DataTypes calc = new DataTypes();
        calc.multiply();
        calc.subtract();

    }


    private int a = 10;
    private int b = 20;

    // Interface implemented methods
    public void multiply() {
        int c = a * b;
        System.out.println(c);
    }
    public void subtract() {
        int c = a - b;
        System.out.println(c);
    }
}

// Interface
interface Calc {
    void multiply();
    void subtract();
}
