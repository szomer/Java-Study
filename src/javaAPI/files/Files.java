package javaAPI.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Files {

    // File methods:
    // canRead()            Tests whether the file is readable or not
    // canWrite()           Tests whether the file is writable or not
    // createNewFile()      Creates an empty file
    // delete()             Deletes file
    // exists()             Tests whether the file exists
    // getName()            Returns the name of the file
    // getAbsolutePath()    Returns the absolute pathname of the file
    // length()             Returns the length of the file in bytes
    // list()               Returns an array of the files in the directory
    // mkdir()              Creates a directory`

    public static void main(String[] args) {
        Files x = new Files();
        x.createFile();
        System.out.println();
        x.write();
        System.out.println();
        x.read();
        System.out.println();
        x.fileInfo();
        System.out.println();
        x.delete();
    }

    final String PATH = "src/javaAPI/files/file.txt";

    // Create a file
    private void createFile() {
        try {
            File file = new File(PATH);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Write to file
    private void write() {
        try {
            FileWriter myWriter = new FileWriter(PATH);
            myWriter.write("Some random text!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Read file
    private void read() {
        try {
            File myObj = new File(PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private void fileInfo() {
        File myObj = new File(PATH);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    // Delete the file
    private void delete() {
        File myObj = new File(PATH);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
