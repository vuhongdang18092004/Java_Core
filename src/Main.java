//import  btap.btap2;
import oop.Car;
import oop.BMW;

public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. Khởi tạo bình thường
        // =========================
        BMW bmw = new BMW("X5");

        System.out.println("=== Đối tượng BMW ===");
        System.out.println(bmw.getName());   // BMW X5
        bmw.showInfo();
        bmw.drift();

        System.out.println();

        // =========================
        // 2. Upcasting
        // =========================
        Car car = new BMW("M5");

        System.out.println("=== Upcasting ===");

        // Gọi được method của Car
        System.out.println(car.getName());

        // Không gọi được method riêng của BMW
        // car.drift(); // Compile Error

        System.out.println();

        // =========================
        // 3. Downcasting
        // =========================
        System.out.println("=== Downcasting ===");

        if (car instanceof BMW) {

            BMW bmw2 = (BMW) car;

            // Bây giờ gọi được method riêng của BMW
            bmw2.drift();

            System.out.println(bmw2.getName());
        }

//        Variable_and_Datatype obj = new Variable_and_Datatype();
//        obj.print_Primitive();
//        obj.print_Non_Primitive();

//        Operator obj = new Operator();
//        obj.calculate();
//        obj.compare();
//        obj.logic();
//        obj.rule();

//        Input_Output obj = new Input_Output();
//        obj.input_Int();
//        obj.input_Double();
//        obj.input_String();

//        Array obj = new Array();
//        obj.input_array();
//        String_prac obj = new String_prac();
//        obj.test_String();
//        String_builder_buffer obj = new String_builder_buffer();
//        obj.test();
//        Regular_Expression obj = new Regular_Expression();
//        obj.test();
//        Car obj = new Car();
//        obj.setName("Lamborghini");
//        System.out.println("Tên xe của bạn : " +obj.getName());
//        Car.get_engineType();

//        BMW car = new BMW("X5");
//        // Gọi method đã override
//        System.out.println(car.getName());
//        System.out.println();
//        // Gọi method dùng super
//        car.showInfo();
    }
}