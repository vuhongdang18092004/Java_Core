import java.util.Arrays;

public class Variable_and_Datatype {

    // Primitive (dữ liệu nguyên thủy)
    boolean bl = true;
    double db = 3.6;
    char c = 'a';
    int num = 10;

    // Non_Primitive (dữ liệu tham chiếu)
    String str = "Hello";
    int[] arr = {1,2,3};

    // Các kiểu chuyển đổi dữ liệu
    int x = 10;
    double y = x; // Chuyển đổi ngầm định (nhỏ -> lớn)

    double z = 10.5;
    int k = (int) z; // Chuyển đổi tường minh (lớn -> nhỏ)

    public void print_Primitive() {
        System.out.println("Các kiểu dữ liệu nguyên thủy");
        System.out.println("byte, short, int, long . Example : "+ num );
        System.out.println("float, double . Example : "+ db );
        System.out.println("char . Example : "+ c );
        System.out.println("boolean . Example : "+ bl );
    }

    public void print_Non_Primitive() {
        System.out.println("Các kiểu dữ liệu tham chiếu");
        System.out.println("String . Example : "+ str );
        System.out.println("Array . Example : "+  Arrays.toString(arr) );
        System.out.println("Ngoài ra còn Class, Interface, Enum, Annotation, Object .");
    }
}