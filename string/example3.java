package string;

public class example3 {
    // charAt(index)  : returns the character located at the specified index (starting from 0).
    public static void main(String[] args) {
        String str1 = "Hello World";

        System.out.println("Char at 4:" + str1.charAt(4)); //  Char at index 4 :o

        System.out.println(" Char at index 13:" + str1.charAt(13));
        //java.lang.StringIndexOutOfBoundsException: Index 13 out of bounds for length 11
    }

}
