package classes.setter_getter;

public class Car {
    // Attributes of Car
    private String brand;
    private int age;
    private String color;

    // Constructor method
    public Car(String brand, int age, String color){
        this.brand = brand;
        this.age = age;
        this.color = color;
    }

    // Setter methods
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }

    // Getter methods
    public String getBrand(){
        return brand;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

    // To String method
    @Override
    public String toString(){
        return "Car{" + brand + ", " + age + ", " + color + "}";
    }
}
