package collections.array_multidementional;

class MultidimensionalArrays {

    public static void main(String[] args){
        MultidimensionalArrays x = new MultidimensionalArrays();
        x.CreateArray();
        x.ManipulateArray();
        x.LoopArray();
    }

    private void CreateArray() {
        // Create arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

    }

    private void ManipulateArray() {
        // Change the value of an element
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 2;
    }

    private void LoopArray(){
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("[" + i + "][" + j+ "] " + myNumbers[i][j]);
            }
        }
    }
}
