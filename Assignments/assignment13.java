/*
Create a java program for user authentication.Users input a username and password, and the
program validates the credentials. Implement exception handling to address potential issues,
such as 'incorrect user name or password (AuthenticationException)' and null input (NullPointerException).

*/

package Assignments;

import java.util.Objects;
import java.util.Scanner;

public class assignment13 {

    // Custom checked exception for authentication failures
    public static class AuthenticationException extends Exception {
        public AuthenticationException(String msg) { super(msg); }
    }

    // Authenticate given username and password. Throws AuthenticationException for bad credentials,
    // NullPointerException if username or password is null.
    
    public static boolean authenticate(String user, String pass) throws AuthenticationException {
        if (user == null || pass == null) throw new NullPointerException("Username or password is null");

        //Creating  arrays of usernames and passwords (indices correspond)
        String[] users = {"alice", "bob", "admin"};
        String[] passes = {"password123", "qwerty", "admin"};

        for (int k = 0; k < users.length; k++) {
            if (Objects.equals(users[k], user) && Objects.equals(passes[k], pass)) // 
            {
                return true; // authenticated
            }
        }
        throw new AuthenticationException("Incorrect user name or password");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test cases
        System.out.println("Test cases:");
        try {
            System.out.println("Expect success: " + authenticate("alice", "password123"));
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
        try {
            System.out.println("Expect auth failure:");
            authenticate("alice", "wrong");
        } catch (AuthenticationException ae) {
            System.out.println("Caught AuthenticationException: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Other: " + e.getMessage());
        }
        try {
            System.out.println("Expect NullPointerException:");
            authenticate(null, "pass");
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException: " + npe.getMessage());
        } catch (Exception e) {
            System.out.println("Other: " + e.getMessage());
        }

        System.out.println();
        // Interactive login
        System.out.println("Interactive login - enter username:");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String pass = sc.nextLine();

        try {
            boolean ok = authenticate(user, pass);
            if (ok) System.out.println("Authentication successful. Welcome, " + user + "!");
        } catch (NullPointerException npe) {
            System.out.println("Null input: " + npe.getMessage());
        } catch (AuthenticationException ae) {
            System.out.println("Authentication failed: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
