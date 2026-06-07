package btap;
import java.util.Scanner;

public class btap2 {

    public void receipt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng : ");
        String name = sc.nextLine();
        System.out.print("Nhập tên sản phẩm : ");
        String product_name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        double price = sc.nextDouble();
        System.out.print("Nhập số lượng sản phẩm : ");
        int number = sc.nextInt();
        System.out.print("Bạn có thẻ thành viên : ");
        boolean member = sc.nextBoolean();
        sc.close();

        System.out.println("Khách hàng : "+name);
        System.out.println("Sản phẩm : "+product_name);
        System.out.println("Giá : "+price);
        System.out.println("Số lượng : "+number);
        double total_price = price*number;
        System.out.println("Thành tiền : "+total_price);
        double discount,VAT;
        if(member == true){
            discount = total_price * 0.1;
            VAT = total_price * 0.08;
            System.out.println("Giảm giá : " + discount);
            System.out.println("VAT : " + VAT);
            System.out.println("Tổng tiền thanh toán : " + (total_price - discount + VAT));
        }else{
            discount = 0;
            VAT = total_price * 0.08;
            System.out.println("Giảm giá : " + discount);
            System.out.println("VAT : " + VAT);
            System.out.println("Tổng tiền thanh toán : " + (total_price - discount + VAT));
        }
    }
}
