import java.util.Scanner;

public class String_builder_buffer {
    public void test() {
        System.out.println("Nếu như String mỗi khi thay đổi thì cần tạo 1 String mới");
        System.out.println("Thì StringBuilder và StringBuffer lại thay đổi trực tiếp trên ô nhớ cũ");
        System.out.println("Về cơ bản 2 loại này giống nhau");
        System.out.println("Chỉ khác là : ");
        System.out.println("_ StringBuilder không Thread-safe và nhanh hơn");
        System.out.println("_ StringBuffer có thread-safe và chậm hơn");
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào string của bạn : ");
        sb.append(sc.nextLine());
        sc.close();
        System.out.println("sb.append('haha') = "+sb.append("haha"));
        System.out.println("sb.insert(5,'haha') = "+sb.insert(5,"haha"));
        System.out.println("sb.replace(1,3,'ha') = "+sb.replace(1,3,"ha"));
        System.out.println("sb.delete(1,3) = "+sb.delete(1,3));
        System.out.println("sb.reverse() = "+sb.reverse());
        System.out.println("Dung lượng ô nhớ hiện tải của sb = "+sb.capacity());
        System.out.println("Đảm bảo dung lượng tối thiểu của bộ nhớ = lệnh sb.ensureCapacity(50)");
    }
}
