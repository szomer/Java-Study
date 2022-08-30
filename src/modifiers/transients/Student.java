package modifiers.transients;

import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    private transient int age; // Now it will not be serialized

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
