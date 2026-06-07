import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public void input_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào kích thước mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập vào các pần tử của mảng : ");
        for(int i = 0;i < n ; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Kích thước mảng của bạn : "+arr.length);
        System.out.print("Mảng của bạn : ");
        for(int i = 0;i < n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
