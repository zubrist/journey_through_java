/*
2. Write a program to accept a m × m matrix from the user. Rotate the matrix by 180 clockwise.
   Display the matrix before and after rotating it.

   Example: Original Matrix:
     1  2  3  4
     5  6  7  8
     9 10 11 12
    13 14 15 16

   Output: Matrix after rotating by 180 degree
    16 15 14 13
    12 11 10  9
     8  7  6  5
     4  3  2  1


*/
package Assignments;

import java.util.Scanner;

public class assignment2 {

    // Rotate an m x m matrix by 180 degrees in-place by swapping symmetric elements.
    // For position (i,j) its 180-degree counterpart is (m-1-i, m-1-j).
    public static void rotate180(int[][] a) {
        int m = a.length;
        // Swap each element with its 180-degree counterpart. To avoid double-swapping,
        // only iterate over half of the matrix (including middle row if m odd) carefully.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int i2 = m - 1 - i;
                int j2 = m - 1 - j;
                // Only swap when current index is before its counterpart in a linear order
                if (i < i2 || (i == i2 && j < j2)) {
                    int tmp = a[i][j];
                    a[i][j] = a[i2][j2];
                    a[i2][j2] = tmp;
                }
            }
        }
    }

    // Helper to print matrix
    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Test case 1: 4x4 example from the prompt
        int[][] t1 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // Test case 2: 3x3 odd-sized matrix to ensure middle element stays in place
        int[][] t2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Test Case 1 - before:");
        printMatrix(t1);
        rotate180(t1);
        System.out.println("Test Case 1 - after rotating 180 degrees:");
        printMatrix(t1);
        System.out.println();

        System.out.println("Test Case 2 - before:");
        printMatrix(t2);
        rotate180(t2);
        System.out.println("Test Case 2 - after rotating 180 degrees:");
        printMatrix(t2);
        System.out.println();

        // Interactive: accept m and then an m x m matrix from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size m (positive integer):");
        int m = sc.nextInt();
        if (m <= 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        int[][] user = new int[m][m];
        System.out.println("Enter " + (m*m) + " integers for the matrix, row by row:");
        for (int i = 0; i < m; i++) for (int j = 0; j < m; j++) user[i][j] = sc.nextInt();

        System.out.println("Original matrix:");
        printMatrix(user);
        rotate180(user);
        System.out.println("Matrix after rotating 180 degrees:");
        printMatrix(user);

        sc.close();
    }
}
