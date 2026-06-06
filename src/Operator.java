public class Operator {
    int a = 10, b = 5;

    public void calculate() {
        System.out.println("Các toán tử số học : ");
        System.out.println("a + b = " +(a+b));
        System.out.println("a - b = " +(a-b));
        System.out.println("a * b = " +(a*b));
        System.out.println("a / b = " +(a/b));
        System.out.println("a % b = " +(a%b));
    }

    public void compare() {
        System.out.println("Các toán tử so sánh : ");
        System.out.println("a > b = " +(a>b));
        System.out.println("a < b = " +(a<b));
        System.out.println("a == b = " +(a==b));
        System.out.println("a != b = " +(a!=b));
        System.out.println("a >= b = " +(a>=b));
        System.out.println("a <= b = " +(a<=b));
    }

    int c = 2 , d = 3 , e =4;

    public void logic() {
        System.out.println("Các toán tử logic : ");
        System.out.println("(c>d) && (d>e) = " +((c>d) && (d>e)));
        System.out.println("(c>d) || (d>e) = " +((c>d) || (d>e)));
        System.out.println("!(c > d) = " +(!(c > d)));
    }

    public void rule() {
        System.out.println(" Các toán tử số học được thực hiện trước toán tử so sánh, và toán tử logic được thực hiện sau cùng");
    }
}
