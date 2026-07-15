/*
1. Write a program to accept a 5 × 5 matrix from the user. Separately find and display
   the sum of odd and even border elements of the array.

   Sample Input (example):
     2 3 6 5 7
     2 0 2 2 0
     0 1 4 5 4
     1 2 7 8 9
     2 8 7 6 3

   Sample Output:
     Sum of even border elements = 30  (2+6+2+4+6+8+2+0)
     Sum of odd border elements = 36   (3+5+7+9+3+7+1+1)

This file implements the solution, includes inline comments explaining the code,
and runs two built-in test cases before prompting the user for interactive input.
*/

package Assignments;
import java.util.Scanner;

public class assignment1 {

    // Compute the sums of even and odd border elements for a square matrix
    public static int[] sumBorderEvenOdd(int[][] a) {
        int n = a.length; // assume square n x n
        int evenSum = 0;
        int oddSum = 0;

        // top row and bottom row
        for (int j = 0; j < n; j++) {
            int valTop = a[0][j];
            int valBottom = a[n - 1][j];
            if (valTop % 2 == 0) evenSum += valTop; else oddSum += valTop;
            if (valBottom % 2 == 0) evenSum += valBottom; else oddSum += valBottom;
        }

        // left and right columns excluding corners (already counted)
        for (int i = 1; i < n - 1; i++) {
            int valLeft = a[i][0];
            int valRight = a[i][n - 1];
            if (valLeft % 2 == 0) evenSum += valLeft; else oddSum += valLeft;
            if (valRight % 2 == 0) evenSum += valRight; else oddSum += valRight;
        }

        return new int[] { evenSum, oddSum };
    }

    // Print matrix - helper used in test output
    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    // Runs two built-in test cases, then allows interactive input for a 5x5 matrix
    public static void main(String[] args) {
        // Test case 1: example from the prompt
        int[][] test1 = {
            {2,3,6,5,7},
            {2,0,2,2,0},
            {0,1,4,5,4},
            {1,2,7,8,9},
            {2,8,7,6,3}
        };

        // Test case 2: another 5x5 matrix to validate behavior (mix of values)
        int[][] test2 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };

        System.out.println("Test Case 1 (sample):");
        printMatrix(test1);
        int[] res1 = sumBorderEvenOdd(test1);
        System.out.println("Sum of even border elements = " + res1[0]);
        System.out.println("Sum of odd border elements = " + res1[1]);
        System.out.println();

        System.out.println("Test Case 2:");
        printMatrix(test2);
        int[] res2 = sumBorderEvenOdd(test2);
        System.out.println("Sum of even border elements = " + res2[0]);
        System.out.println("Sum of odd border elements = " + res2[1]);
        System.out.println();

        // Now prompt user to enter a 5x5 matrix
        Scanner sc = new Scanner(System.in);
        final int N = 5;
        int[][] user = new int[N][N];
        System.out.println("Enter a 5x5 matrix (25 integers), row by row:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Read next integer; if input isn't available it will wait for user
                user[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix:");
        printMatrix(user);
        int[] userRes = sumBorderEvenOdd(user);
        System.out.println("Sum of even border elements = " + userRes[0]);
        System.out.println("Sum of odd border elements = " + userRes[1]);

        sc.close();
    }
}
