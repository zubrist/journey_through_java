/*
Input list of N numbers (including 0 input ) in array and print the value in a particular position
of array, position will be specified by user, also calculate the expression (i_th value) / (ith+1 value).
Use multictch statement with single try to handle 'Divide by zero' and 'ArrayIndexOutOfBounds' exceptions

Keep the question as it is
*/

package Assignments;

import java.util.Scanner;

public class assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements N:");
        int N = sc.nextInt();
        int[] a = new int[N];
        System.out.println("Enter " + N + " integers (can include 0):");
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        System.out.println("Enter index i (0-based) to inspect:");
        int i = sc.nextInt();

        // Single try to catch both divide-by-zero and index-out-of-bounds
        try {
            int val = a[i];
            System.out.println("Value at position " + i + " = " + val);

            int next = a[i+1];
            // perform integer division but show as double for clarity
            double expr = (double) val / (double) next;
            System.out.println("Expression a[i] / a[i+1] = " + expr);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Handle both divide by zero and index out of bounds here
            System.out.println("Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            if (e instanceof ArithmeticException) {
                System.out.println("Cannot divide by zero.");
            } else {
                System.out.println("Index out of bounds or missing next element.");
            }
        }

        sc.close();
    }
}
