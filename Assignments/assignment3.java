/*
3. Write a program to take 20 integer numbers as input. Arrange the array in such a way
   that all the odd numbers are at the front of the array and all the even numbers are at the
   rear of the array. All odd numbers should be sorted ascending among themselves, and all
   even numbers should be sorted ascending among themselves. You cannot use any other array.

   Requirement: operate in-place (no additional arrays). Sorting may use in-place algorithms
   or library routines that sort subranges in-place.

This file provides an in-place partitioning followed by in-place sorting of each segment,
includes inline comments, two test cases, and an interactive input mode.
*/

package Assignments;
import java.util.Arrays;
import java.util.Scanner;

public class assignment3 {

    // Partition the array so that odds come before evens. Returns the index 'p'
    // such that array[0..p-1] are odd and array[p..n-1] are even.
    // This uses two-pointer swapping and does not allocate any extra array.
    public static int partitionOddsFront(int[] a) {
        int i = 0;            // scan from left
        int j = a.length - 1; // scan from right
        while (i <= j) {
            // Move i forward while a[i] is odd
            while (i <= j && (a[i] % 2 != 0)) i++;
            // Move j backward while a[j] is even
            while (i <= j && (a[j] % 2 == 0)) j--;
            // Now a[i] is even (or i>j) and a[j] is odd (or i>j) -> swap
            if (i < j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++; j--;
            }
        }
        // i is the first index of the even segment
        return i;
    }

    // Main routine: partition then sort each segment in-place
    public static void arrangeOddsThenEvens(int[] a) {
        int p = partitionOddsFront(a);
        // Sort odd segment ascending (0..p-1) and even segment ascending (p..n-1)
        Arrays.sort(a, 0, p);
        Arrays.sort(a, p, a.length);
    }

    private static void printArr(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Test case 1: mix of odds and evens, unsorted
        int[] t1 = {12, 3, 5, 8, 7, 2, 11, 4, 1, 10, 9, 6, 15, 14, 13, 16, 19, 18, 17, 20};
        System.out.println("Test Case 1 - before:");
        printArr(t1);
        arrangeOddsThenEvens(t1);
        System.out.println("Test Case 1 - after:");
        printArr(t1);
        System.out.println();

        // Test case 2: already partially ordered, includes duplicates and negatives
        int[] t2 = {5, -3, 2, 4, 7, 7, 0, 11, 14, 13, 12, 9, 8, -1, 6, 15, 18, 17, 16, 10};
        System.out.println("Test Case 2 - before:");
        printArr(t2);
        arrangeOddsThenEvens(t2);
        System.out.println("Test Case 2 - after:");
        printArr(t2);
        System.out.println();

        // Interactive mode: read 20 integers from user
        Scanner sc = new Scanner(System.in);
        final int N = 20;
        int[] user = new int[N];
        System.out.println("Enter 20 integers (separated by spaces or newlines):");
        for (int i = 0; i < N; i++) user[i] = sc.nextInt();

        System.out.println("Before arranging:");
        printArr(user);
        arrangeOddsThenEvens(user);
        System.out.println("After arranging (odds then evens, each sorted ascending):");
        printArr(user);

        sc.close();
    }
}
