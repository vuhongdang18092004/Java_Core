import java.util.Scanner;

public class Input_Output {

    public void input_Int() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên của bạn : ");
        int a = scanner.nextInt();
        scanner.close();
        System.out.println("Bạn vừa nhập số : " + a);
    }

    public void input_Double() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thực của bạn : ");
        double a = scanner.nextDouble();
        scanner.close();
        System.out.println("Bạn vừa nhập số : " + a);
    }

    public void input_String() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập xâu của bạn = nextLine : ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập xâu của bạn = next : ");
        String s2 = scanner.next();
        scanner.close();
        System.out.println("Bạn vừa nhập xâu : " + s1 + " " + s2);
    }

}
