package collections.array;

class Arrays {

    public static void main(String[] args){
        Arrays x = new Arrays();
        x.createArray();
        x.manipulateArray();
        x.loopArray();
    }

    private void createArray() {
        // Create arrays
        String[] cars;
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        // Get the length of the array
        System.out.println(cars2.length);
    }

    private void manipulateArray() {
        // Change the value of an element
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
    }

    private void loopArray(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // For Loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // For Each Loop
        // Syntax
        //      for (type variable : arrayname) {
        //          ...
        //      }
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
