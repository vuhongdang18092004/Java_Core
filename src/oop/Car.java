package oop;

public class Car {
    private String name;

    // Constructor mặc định (không tham số)
    public Car() {
    }

    // Constructor có tham số
    public Car(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}
