package modifiers.finals;

class Animal {
    private final int legs = 4;
    private final int ears = 2;
    private final int eyes = 2;
    private final int tail = 1;

    public final void characteristics(){
        System.out.println("General Characteristics of an Animal are: ");
        System.out.println("Legs: " + legs);
        System.out.println("Eyes: " + eyes);
        System.out.println("Ears: " + ears);
        System.out.println("Tail: " + tail);
    }
}
