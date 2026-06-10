package oop;

public class BMW extends Car {

    // Constructor
    public BMW(String name) {
        super(name);   // Gọi constructor của class Car
    }

    // Override method của class cha
    @Override
    public String getName() {
        return "BMW " + super.getName();
    }

    // Method sử dụng super
    public void showInfo() {
        System.out.println("Tên xe: " + super.getName());

        // Gọi static method của class cha
        super.get_engineType();
    }
}