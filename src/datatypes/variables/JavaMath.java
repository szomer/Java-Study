package datatypes.variables;

class JavaMath {

    public static void main(String[] args){
       JavaMath x = new JavaMath();
        x.javaMath();
    }

    private void javaMath() {
        // BASIC FUNCTIONS

        // Returns the highest value
        Math.max(5, 10);        // answer -> 10
        // Returns the lowest value
        Math.min(5, 10);        // answer -> 5
        // Returns the square root
        Math.sqrt(64);          // answer -> 8
        // Returns the absolute (positive) value
        Math.abs(-4.7);         // answer -> 4.7
        // Returns a random number
        Math.random();          // answer -> 0.0 - 1.0
        // Returns the value of the first argument raised to the power of the second one
        Math.pow(5,2);          // answer -> 25
        // Returns the cube root of a double
        Math.cbrt(125);         // answer -> 5
        // Returns 1 if the argument is positive otherwise -1
        Math.signum(-5);        // answer -> -1
        // Returns the first argument with the sign of the second argument
        Math.copySign(5,-1);    // answer -> -5


        // EXPONENTIAL & LOGARITHMIC FUNCTIONS

        // Returns Euler's number raised to the power of the argument
        Math.exp(1);            // answer -> 2.718281828459045
        // Returns Euler's number raised to the power of the argument, but it adds -1
        Math.expm1(1);          // answer -> 1.718281828459045
        // Returns the natural logarithm of a double value
        Math.log(Math.E);       // answer -> 1
        // Returns the logarithm in base 10 of the argument
        Math.log10(10);         // answer -> 1
        // Returns the logarithm in base 10 of the argument, but adds 1 (1+x)
        Math.log1p(Math.E);     // answer -> 1.3132616875182228


        // TRIGONOMETRIC FUNCTIONS

        // Receives a single, double argument that represents an angle (in radians) and returns the trigonometric sine
        Math.sin(Math.PI/2);        // answer -> 1
        // returns the trigonometric cosine of an angle (in radians)
        Math.cos(0);                // answer -> 1
        // Returns the trigonometric tangent of an angle (in radians):
        Math.tan(Math.PI/4);        // answer -> 1
        // They return respectively the hyperbolic sine, hyperbolic cosine and hyperbolic tangent of a double value
        Math.sinh(Math.PI);
        Math.cosh(Math.PI);
        Math.tanh(Math.PI);
        // Returns the arc sine of the argument received
        Math.asin(1);               // answer -> pi/2
        // Returns the arc cosine of the argument received
        Math.acos(0);               // answer -> pi/2
        // Returns the arc tangent of the argument received
        Math.atan(1);               // answer -> pi/4
        // receives the ordinate coordinate y and the abscissa coordinate x, and returns the angle ϑ from
        // the conversion of rectangular coordinates (x,y) to polar coordinates (r, ϑ):
        Math.atan2(1,1);            // answer -> pi/4
        // convert radians to degrees
        Math.toDegrees(Math.PI);    // answer -> 180
        // convert degrees to radians
        Math.toRadians(180);        // answer -> pi


        // ROUNDING AND OTHER FUNCTIONS

        // Round an integer to the smallest double value that is greater than or equal to the argument:
        Math.ceil(Math.PI);         // answer -> 4
        // Round a number to the largest double that is less than or equal to the argument we should use floor():
        Math.floor(Math.PI);        // answer -> 3
        // Returns an unbiased exponent of the argument.
        Math.getExponent(333.3);    // answer -> 8
        Math.getExponent(222.2f);   // answer -> 7
        // Computes the division between the first (dividend) and the second (divisor) argument and returns
        // the remainder as prescribed by the IEEE 754 standard
        Math.IEEEremainder(5,2);    // answer -> 1
        // The neighboring of a double or a float value
        Math.nextAfter(1.95f,1);    // answer -> 1.9499999
        Math.nextAfter(1.95f,2);    // answer -> 1.9500002
        // The neighboring of a double or a float value. Returns the adjacent value only in the direction of
        // a positive infinity
        Math.nextUp(1.95f);         // answer -> 1.9500002
        // Returns a double that is the closest integer value of the argument
        Math.rint(1.95f);           // answer -> 2.0
        // Returns a double that is the closest integer value of the argument. but this one returns an int value
        // if the argument is a float and a long value if the argument is a double:
        Math.round(1.95f);          // answer -> 2
        Math.round(1.95);           // answer -> 2
        // Scalb is an abbreviation for a “scale binary”. This function executes one shift, one conversion and
        // a double multiplication
        Math.scalb(3, 4);           // answer -> 3*2^4
        // returns the distance from a number to its nearest neighbors
        Math.ulp(1);                // answer -> 1.1920929E-7
        Math.ulp(2);                // answer -> 2.3841858E-7
        Math.ulp(4);                // answer -> 4.7683716E-7
        Math.ulp(8);                // answer -> 9.536743E-7
        // Returns the square root of the sum of squares of its argument
        Math.hypot(4, 3);           // answer -> 5

    }

    // Math allows for performing mathematical tasks
    // All Math methods are static.

    // Math methods:
        // Math.abs(x)
        // Math.acos(x)
        // Math.asin(x)
        // Math.atan(x)
        // Math.atan2(y, x)
        // Math.cbrt(x)
        // Math.ceil(x)
        // Math.copySign(x, y)
        // Math.cos(x)
        // Math.cosh(x)
        // Math.exp(x)
        // Math.expm1(x)
        // Math.floor(x)
        // Math.getExponent(x)
        // Math.hypot(x, y)
        // Math.IEEEremainder(x, y)
        // Math.log(x)
        // Math.log10(x)
        // Math.max(x, y)
        // Math.min(x, y)
        // Math.nextAfter()
        // Math.nextUp()
        // Math.pow(x, y)
        // Math.random()
        // Math.round(x)
        // Math.rint(x)
        // Math.signum(x)
        // Math.sin(x)
        // Math.sinh(x)
        // Math.sqrt(x)
        // Math.tan(x)
        // Math.tanh(x)
        // Math.toDegrees(x)
        // Math.toRadians(x)
        // Math.ulp(x)
}
