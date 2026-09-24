package string;
import java.lang.String; // importing the String Class

public class stringLiteral {
    public static void main(String[] args) {
        // Making an object of the String class

        String str = "Hello World!"; // "" ->this is refereed as string letaral

        System.out.println("Your String is: "+ str);
        System.out.println("Identity Hash of s1: " + System.identityHashCode(str));

        String str2 = "Hello World!";

        System.out.println("Your String is: "+ str2);
        System.out.println("Identity Hash of s1: " + System.identityHashCode(str2));

        System.out.println("str == str2 (Literals): " + (str == str2)); // true (points to same pool object)
    }
    
}
