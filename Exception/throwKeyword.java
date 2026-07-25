package Exception;
//The throw keyword is used to explicitly throw an exception from a method or block of code.
//  It is mostly used with custom or specific exceptions.
public class throwKeyword {

    public static void main(String[] args) {
        int age = 15;
        if (age<18) {
            System.out.println("You are not eligible to vote");
            throw new ArithmeticException("Age must be >= 18");
            
        }
        else
        {
            System.out.println("You can vote");
        }
    }
    
}
