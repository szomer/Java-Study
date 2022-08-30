package datatypes.variables;

class JavaMath {

    public static void main(String[] args){
       JavaMath x = new JavaMath();
        x.javaMath();
    }

    private void javaMath() {
        // Returns the highest value
        System.out.println(Math.max(5, 10));    // answer -> 10

        // Returns the lowest value
        System.out.println(Math.min(5, 10));    // answer -> 5

        // Returns the square root
        System.out.println(Math.sqrt(64));      // answer -> 8

        // Returns the absolute (positive) value
        System.out.println(Math.abs(-4.7));     // answer -> 4.7

        // Returns a random number
        System.out.println(Math.random());      // answer -> 0.0 - 1.0
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
