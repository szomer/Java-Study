package collections.array;

class ArrayMulti {

    public static void main(String[] args){
        ArrayMulti x = new ArrayMulti();
        x.createArray();
        x.manipulateArray();
        x.loopArray();
    }

    private void createArray() {
        // Create arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

    }

    private void manipulateArray() {
        // Change the value of an element
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 2;
    }

    private void loopArray(){
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("[" + i + "][" + j+ "] " + myNumbers[i][j]);
            }
        }
    }
}
