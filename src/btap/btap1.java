package btap;

import java.util.Scanner;

public class btap1 {

    Scanner sc = new Scanner(System.in);

    public int input() {
        return sc.nextInt();
    }

    public void calculate() {

        System.out.print("Nhập chiều dài: ");
        int length = input();

        System.out.print("Nhập chiều rộng: ");
        int width = input();

        System.out.println("Chu vi = " + (length + width) * 2);
        System.out.println("Diện tích = " + (length * width));
    }
}