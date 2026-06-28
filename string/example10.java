package string;

public class example10 {
    public static void main(String[] args) {
        // indexOf(subString) : returns the index of the first occurrence of the specified substring. If the substring is not found, it returns -1.

        String message = "Welcome to Java World , my Java Developer";
        System.out.println(message.indexOf("Java"));

        System.out.println(message.indexOf("Java",12));
    }
}
