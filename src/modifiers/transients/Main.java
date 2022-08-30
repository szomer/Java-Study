package modifiers.transients;

import java.io.*;

class Main {

    public static void main(String[] arg){
        Main x = new Main();
        x.transientExample();
    }

    // In Java, Serialization is used to convert an object into a stream of the byte.
    // The byte stream consists of the data of the instance as well as the type of data stored in that instance.
    // Deserialization performs exactly opposite operation. It converts the byte sequence into original object data.
    // During the serialization, when we do not want an object to be serialized we can use a transient keyword.

    // Syntax:
    private transient String password = "secret";

    private void transientExample() {
        // Create new student object
        Student student = new Student(211, "Ravi", 22);

        try {

            // Write object into file
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Suus\\IdeaProjects\\PractiseJava\\src" +
                    "\\modifiers\\transients\\file.txt");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(student);
            out.flush();
            out.close();
            System.out.println("Success");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            // Read the file and put into Student object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Suus\\IdeaProjects" +
                    "\\PractiseJava\\src\\modifiers\\transients\\file.txt"));
            student = (Student) in.readObject();
            in.close();

            // Show student attributes
            System.out.println("ID: " + student.getId() + ", NAME: " + student.getName() + ", AGE: "
                    + student.getAge());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
