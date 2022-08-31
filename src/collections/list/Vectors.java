package collections.list;

import java.util.Vector;

class Vectors {

    private Vector<Integer> vector;

    public static void main(String[] args){
        Vectors x = new Vectors();
        x.create();
        x.access();
        x.loop();
    }

    private void create(){
        vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Vector List: " + vector);
    }

    private void access(){
        // Return value of element with index 1
        vector.get(1);
    }

    private void loop(){
        // Printing elements one by one
        for (int i = 0; i < vector.size(); i++)
            System.out.print(vector.get(i) + " ");
    }
}
