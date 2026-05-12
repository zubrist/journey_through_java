package controlFlow;
import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
    
        // database
    String username = "Reja";
    String password = "123kol@Reja";

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your Username...");
    String  yourUsername = sc.nextLine();

    System.out.print("Enter your Password...");
    String  yourPassword = sc.nextLine();

    if(yourUsername.equals(username) && yourPassword.equals(password)){
        System.out.println("Login Successful");
    }
    else{
        System.out.println("Wrong Credentials ...");
    }
        
    }

    


    
}
