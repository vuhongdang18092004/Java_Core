package oop;

public class BMW extends Car {

    public BMW(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "BMW " + super.getName();
    }

    public void showInfo() {
        System.out.println("Tên xe: " + super.getName());
        Car.get_engineType(); // gọi theo tên class sẽ chuẩn hơn
    }

    // Method chỉ BMW có
    public void drift() {
        System.out.println("BMW đang drift!");
    }
}