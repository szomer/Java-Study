package methods.flowcontrol;

class Statements {

    public static void main(String[] args){
        Statements x = new Statements();
        x.ifElse();
        x.switchCase();
    }

    private void ifElse() {
        // Syntax
        //      variable = (condition) ? expressionTrue : expressionFalse;

        int time;

        // Detailed format
        time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Shorthanded format
        time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }

    private void switchCase() {
        // Syntax
        //      switch(expression) {
        //          case x:
        //              // code block
        //              break;
        //          case y:
        //              // code block
        //              break;
        //          default:
        //              // code block
        //      }

        int day = 4;

        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }
}
