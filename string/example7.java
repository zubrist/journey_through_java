package string;

public class example7 {
    public static void main(String[] args) {
        // replace(char oldChar, char newChar) : returns a new string by replacing all occurrences of oldChar with newChar. 

        String str1 = "Banana";
        System.out.println("Before: " +str1);
        System.out.println("After: " + str1.replace('a', 'o'));


        String name = " Ahmed Reja ";
        System.out.println(name.replace(" ", ""));
        
        //System.out.println(name.replace("\\s+", ""));
        


    }
}
