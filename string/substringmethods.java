package string;

public class substringmethods {
    public static void main(String[] args) {
        
        String Name = "Subhas Chandra Bose";

        String firstName = Name.substring(0,6);
        System.out.println("First Name: " + firstName);

        String lastName = Name.substring(6);
        System.out.println("Last Name: "+ lastName);

        // edge case
        System.out.println(Name.substring(10, 3));
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [10, 3) out of bounds for length 19


    }
    
}
