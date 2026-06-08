import java.util.regex.Pattern;

public class Regular_Expression {

    public void test() {

        System.out.println(". : Đại diện cho bất kỳ ký tự nào");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches(".", "a"));
        System.out.println(Pattern.matches(".", "5"));
        System.out.println(Pattern.matches(".", "ab"));

        System.out.println("\n---------------------------------\n");

        System.out.println("\\d : Đại diện cho 1 chữ số (0-9)");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\d", "5"));
        System.out.println(Pattern.matches("\\d", "a"));

        System.out.println("\n---------------------------------\n");

        System.out.println("\\D : Đại diện cho ký tự KHÔNG phải số");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\D", "a"));
        System.out.println(Pattern.matches("\\D", "5"));

        System.out.println("\n---------------------------------\n");

        System.out.println("\\s : Đại diện cho khoảng trắng");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\s", " "));
        System.out.println(Pattern.matches("\\s", "a"));

        System.out.println("\n---------------------------------\n");

        System.out.println("\\w : Đại diện cho chữ cái, số hoặc _");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\w", "A"));
        System.out.println(Pattern.matches("\\w", "7"));
        System.out.println(Pattern.matches("\\w", "_"));
        System.out.println(Pattern.matches("\\w", "@"));

        System.out.println("\n---------------------------------\n");

        System.out.println("+ : Ký tự đứng trước xuất hiện 1 hoặc nhiều lần");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("a+", "a"));
        System.out.println(Pattern.matches("a+", "aaaa"));
        System.out.println(Pattern.matches("a+", ""));

        System.out.println("\n---------------------------------\n");

        System.out.println("* : Ký tự đứng trước xuất hiện 0 hoặc nhiều lần");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("a*", ""));
        System.out.println(Pattern.matches("a*", "aaaa"));
        System.out.println(Pattern.matches("a*", "b"));

        System.out.println("\n---------------------------------\n");

        System.out.println("? : Ký tự đứng trước xuất hiện 0 hoặc 1 lần");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("a?", ""));
        System.out.println(Pattern.matches("a?", "a"));
        System.out.println(Pattern.matches("a?", "aa"));

        System.out.println("\n---------------------------------\n");

        System.out.println("[abc] : Chỉ chấp nhận a hoặc b hoặc c");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("[abc]", "a"));
        System.out.println(Pattern.matches("[abc]", "b"));
        System.out.println(Pattern.matches("[abc]", "d"));

        System.out.println("\n---------------------------------\n");

        System.out.println("[a-z] : Một chữ thường");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("[a-z]", "m"));
        System.out.println(Pattern.matches("[a-z]", "M"));

        System.out.println("\n---------------------------------\n");

        System.out.println("[A-Z] : Một chữ hoa");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("[A-Z]", "M"));
        System.out.println(Pattern.matches("[A-Z]", "m"));

        System.out.println("\n---------------------------------\n");

        System.out.println("[0-9] : Một chữ số");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("[0-9]", "5"));
        System.out.println(Pattern.matches("[0-9]", "a"));

        System.out.println("\n---------------------------------\n");

        System.out.println("^ : Chuỗi phải bắt đầu bằng...");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("^Java.*", "Java Core"));
        System.out.println(Pattern.matches("^Java.*", "Spring"));

        System.out.println("\n---------------------------------\n");

        System.out.println("$ : Chuỗi phải kết thúc bằng...");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches(".*Java$", "I love Java"));
        System.out.println(Pattern.matches(".*Java$", "Java Core"));

        System.out.println("\n---------------------------------\n");

        System.out.println("{n} : Xuất hiện đúng n lần");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\d{4}", "1234"));
        System.out.println(Pattern.matches("\\d{4}", "123"));

        System.out.println("\n---------------------------------\n");

        System.out.println("{n,m} : Xuất hiện từ n đến m lần");
        System.out.println("Ví dụ:");
        System.out.println(Pattern.matches("\\d{3,5}", "123"));
        System.out.println(Pattern.matches("\\d{3,5}", "12345"));
        System.out.println(Pattern.matches("\\d{3,5}", "12"));
    }
}