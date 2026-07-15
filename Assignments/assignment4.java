/*
4. Write a program in Java that inputs a sentence and prints the sentence by reversing
   each word individually. Also find the occurrences of the longest word in the sentence.

   Example: Input: "This is a sample sentence for testing"
            Output (words reversed): "sihT si a elpmas ecnetnes rof gnitset"
            Longest word: "sentence" occurs 1 time(s)

*/
package Assignments;
import java.util.Scanner;

public class assignment4 {

    // Reverse characters of a string token
    private static String reverseToken(String s) {
        return new StringBuilder(s).reverse().toString();
    }



    // Process a sentence: reverse each word (preserving token boundaries separated by whitespace)
    // and compute the longest word(s) and count occurrences of the longest word 
    public static Result processSentence(String sentence) {
        String[] tokens = sentence.split("\\s+"); // split on whitespace 
        StringBuilder reversedSentence = new StringBuilder();

        // Track longest normalized length and the normalized longest word (first encountered)
        int maxLen = 0;
        String longestNorm = "";

        // First pass: determine longest token length and which token is longest
        for (String tok : tokens) {
            String raw = tok; // use raw token as requested
            if (raw.length() > maxLen) {
                maxLen = raw.length();
                longestNorm = raw;
            }
        }

        // Count occurrences of the longest raw token (exact match)
        int occurrences = 0;
        if (!longestNorm.isEmpty()) {
            for (String tok : tokens) if (tok.equals(longestNorm)) occurrences++;
        }

        // Build reversed-words sentence
        for (int i = 0; i < tokens.length; i++) {
            if (i > 0) reversedSentence.append(" ");
            reversedSentence.append(reverseToken(tokens[i]));
        }

        return new Result(reversedSentence.toString(), longestNorm, occurrences, maxLen);
    }

    // Simple result holder
    public static class Result {
        public final String reversedSentence;
        public final String longestWordNormalized;
        public final int occurrences;
        public final int longestLength;
        public Result(String r, String w, int c, int L) {
            this.reversedSentence = r;
            this.longestWordNormalized = w;
            this.occurrences = c;
            this.longestLength = L;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        String s1 = "This is a sample sentence for testing";
        System.out.println("Test 1 input: " + s1);
        Result r1 = processSentence(s1);
        System.out.println("Reversed-words: " + r1.reversedSentence);
        System.out.println("Longest word (normalized): '" + r1.longestWordNormalized + "' length=" + r1.longestLength + " occurrences=" + r1.occurrences);
        System.out.println();

        // Test case 2: punctuation and duplicates
        String s2 = "Hello, hello! world-world world.";
        System.out.println("Test 2 input: " + s2);
        Result r2 = processSentence(s2);
        System.out.println("Reversed-words: " + r2.reversedSentence);
        System.out.println("Longest word (normalized): '" + r2.longestWordNormalized + "' length=" + r2.longestLength + " occurrences=" + r2.occurrences);
        System.out.println();

        // Interactive
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String line = sc.nextLine();
        Result ri = processSentence(line);
        System.out.println("Reversed-words: " + ri.reversedSentence);
        if (ri.longestLength > 0) {
            System.out.println("Longest word (normalized): '" + ri.longestWordNormalized + "' occurs " + ri.occurrences + " time(s)");
        } else {
            System.out.println("No valid word found in the sentence.");
        }
        sc.close();
    }
}
