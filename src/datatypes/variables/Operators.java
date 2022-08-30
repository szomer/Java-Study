package datatypes.variables;

class Operators {

    public static void main(String[] args){
        Operators x = new Operators();
        x.arithmetic();
        x.assignment();
        x.comparison();
        x.logical();
    }

    // Mathematical Operations
    private void arithmetic() {
        int a = 6;
        int b = 2;
        int c;

        // +            -> addition
        c = a + b;      // 6 + 2 = 8

        // -            -> subtraction
        c = a - b;      // 6 - 2 = 4

        // *            -> multiplication
        c = a * b;      // 6 * 2 = 12

        // /            -> division
        c = a / b;      // 6 / 2 = 3

        // %            -> modulus
        c = a % b;      // 6 mod 2 = 0

        // ++           -> increment
        ++a;            // a = a + 1;

        // --           -> decrement
        --a;            // a = a - 1;
    }

    // Assignment Operations
    private void assignment() {
        int x;

        // =            -> assignment operator
        x = 10;         // x = 10

        // +=           -> addition assignment operator
        x += 5;         // x = x + 5

        // -=           -> subtraction assignment operator
        x -= 5;         // x = x - 5

        // *=           -> multiplication assignment operator
        x *= 5;         // x = x * 5

        // /=           -> division assignment operator
        x /= 5;         // x = x / 5

        // %=           -> modulus assignment operator
        x %= 5;         // x = x % 5

        // &=           -> relational assignment operator
        x &= 5;         // x = x & 5

        // |=           -> subtraction assignment operator
        x |= 5;         // x = x | 5

        // ^=           -> subtraction assignment operator
        x ^= 5;         // x = x ^ 5

        // >>=          -> subtraction assignment operator
        x >>= 5;        // x = x >> 5

        // <<=          -> subtraction assignment operator
        x <<= 5;        // x = x << 5
    }

    // Comparison Operators
    private void comparison() {
        int a = 3;
        int b = 5;

        // ==           -> a equals b
        if(a == b){}

        // !=           -> a does not equal b
        if(a != b){}

        // >            -> a is greater than b
        if(a > b){}

        // <            -> a is less than b
        if(a < b){}

        // >=           -> a is greater of equal than b
        if(a >= b){}

        // <=           -> a is less of equal than b
        if(a <= b){}
    }

    // Logical Operators
    private void logical() {
        boolean statement1 = true, statement2 = false;

        // &&                               -> logical and
        if(statement1 && statement2){}      // returns true if both statements are true

        // &&                               -> logical or
        if(statement1 && statement2){}      // returns true if one of the statements is true

        // !                                -> logical not
        if(!(statement1 && statement2)){}   // returns true if statement is false


    }
}
