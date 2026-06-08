import java.util.Scanner;

public class String_prac {
    public void test_String() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào xâu của bạn : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("str.length() = " +str.length() );
        System.out.println("str.charAt(1) =  "+str.charAt(1));
        String sub = str.substring(0,3);
        System.out.println("String sub = str.subString(0,3) = "+ sub);
        String upper_case = str.toUpperCase();
        System.out.println("String upper_case = str.toUpperCase() = "+upper_case);
        String lower_case = str.toLowerCase();
        System.out.println("String lower_case = str.toLowerCase() = "+lower_case);
        String delete_space = str.trim();
        System.out.println("String delete_space = str.trim() = "+delete_space);
        System.out.println("str1 = 'Hello', str2 = 'Hello' => str1.equals(str2) = "+("Hello").equals("Hello"));
        System.out.println("str1 = 'hello', str2 = 'Hello' => str1.equalsIgnoreCase(str2) = "+("hello").equalsIgnoreCase("Hello"));
        System.out.println("str1 = 'abcde', str2 = 'bcd' => str1.equals(str2) = "+("abcde").contains("bcd"));
        System.out.println("str1 = 'Hahaha' => str1.replace('a','i') = "+("Hahaha").replace('a','i'));
        System.out.println("str1 = 'haha', str2 = 'ha' => str1.indexOf(str2) = "+("haha").indexOf("ha"));
        System.out.println("str1 = 'haha', str2 = 'ha' => str1.lastIndexOf(str2) = "+("haha").lastIndexOf("ha"));
        String list = "apple, orange, banana";
        String [] fruits = list.split(",");
        System.out.print(list+" => String [] fruits = list.split(\",\") = ");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
