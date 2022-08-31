package methods.flowcontrol;

class Loops {

    public static void main(String[] args){
        Loops x = new Loops();
        x.doWhile();
        x.forLoop();
        x.forEachLoop();
    }

    private void doWhile(){
        // Syntax
        //      do {
        //          // code block to be executed
        //      }
        //      while (condition);

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

    private void forLoop() {
        // Syntax
        //      for (statement 1; statement 2; statement 3) {
        //          // code block to be executed
        //      }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    private void forEachLoop() {
        // Syntax
        //      for (type variableName : arrayName) {
        //          // code block to be executed
        //      }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
