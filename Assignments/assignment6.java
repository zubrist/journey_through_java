/*
6. Write a program to accept a word. Check and display whether the word is:
   - a palindrome
   - a special word (starts and ends with same letter)
   - both
   - or none

   Examples:
     Input: CIVIC  -> Both a palindrome and a special word
     Input: COMIC  -> Not a palindrome but a special word

   
*/

package Assignments;
import java.util.Scanner;

public class assignment6 {

    // Return true if the given word is a palindrome (case-insensitive)
    private static boolean isPalindrome(String w) {
        String s = w.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // Return true if the word is "special": starts and ends with same letter (case-insensitive)
    private static boolean isSpecial(String w) {
        if (w.length() == 0) return false;
        String s = w.toLowerCase();
        return s.charAt(0) == s.charAt(s.length() - 1);
    }

    // Produce the desired message based on checks
    private static String classify(String w) {
        boolean pal = isPalindrome(w);
        boolean spec = isSpecial(w);
        if (pal && spec) return "Both a palindrome and a special word";
        if (!pal && spec) return "Not a palindrome but a special word";
        if (pal && !spec) return "Palindrome but not a special word";
        return "Neither a palindrome nor a special word";
    }

    public static void main(String[] args) {
        // Test case 1
        String t1 = "CIVIC";
        System.out.println("Input: " + t1);
        System.out.println("Output: " + classify(t1));
        System.out.println();

        // Test case 2
        String t2 = "COMIC";
        System.out.println("Input: " + t2);
        System.out.println("Output: " + classify(t2));
        System.out.println();

        // Interactive
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String in = sc.next();
        System.out.println(classify(in));
        sc.close();
    }
}
