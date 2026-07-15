/*
5. Write a program in Java that inputs a sentence and:
   - prints all consecutive vowel sequences found in the sentence
   - prints the sentence after deleting all consonants (keep vowels and non-letter chars)

*/

package Assignments;
import java.util.Scanner;

public class assignment5 {

    // Check if a character is a vowel 
    private static boolean isVowel(char c) {
        char x = Character.toLowerCase(c);
        return x=='a' || x=='e' || x=='i' || x=='o' || x=='u';
    }

    // Find all consecutive vowel sequences (length >= 1) in the sentence
    
    private static String[] findConsecutiveVowels(String s) {
        // First pass: count sequences
        int count = 0;
        boolean inVowel = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                if (!inVowel) {
                    count++;
                    inVowel = true;
                }
            } else {
                inVowel = false;
            }
        }

        if (count == 0) return new String[0];

        // Second pass: collect sequences
        String[] res = new String[count];
        StringBuilder cur = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                cur.append(c);
            } else {
                if (cur.length() > 0) {
                    res[idx++] = cur.toString();
                    cur.setLength(0);
                }
            }
        }
        if (cur.length() > 0) res[idx++] = cur.toString();
        return res;
    }

    // Remove consonant letters from the sentence; keep vowels and non-letter characters
    private static String removeConsonants(String s) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) out.append(c); // keep vowel letters
                // else skip consonant
            } else {
                // keep non-letter characters (spaces, punctuation, digits)
                out.append(c);
            }
        }
        return out.toString();
    }

    public static void main(String[] args) {
        // Single simple test case
        String test = "Beautiful sea, ooze and queueing!";
        System.out.println("Test input: " + test);
        String[] vowels = findConsecutiveVowels(test);
        System.out.print("Consecutive vowel sequences: [");
        for (int i=0;i<vowels.length;i++) {
            if (i>0) System.out.print(", ");
            System.out.print(vowels[i]);
        }
        System.out.println("]");
        System.out.println("After deleting consonants: " + removeConsonants(test));
        System.out.println();

        // Interactive: read a sentence and do the same
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String line = sc.nextLine();
        String[] v2 = findConsecutiveVowels(line);
        System.out.print("Consecutive vowel sequences: [");
        for (int i=0;i<v2.length;i++) {
            if (i>0) System.out.print(", ");
            System.out.print(v2[i]);
        }
        System.out.println("]");
        System.out.println("After deleting consonants: " + removeConsonants(line));
        sc.close();
    }
}
