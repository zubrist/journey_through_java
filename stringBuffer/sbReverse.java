package stringBuffer;

// reverse() method of the StringBuffer class reverses the current string.  


public class sbReverse {
    public static void main(String[] args) {
        StringBuffer sb11 = new StringBuffer("Computer");
        sb11.reverse();
        System.out.println(sb11);

        
        // Cheking palindrome 

        String word = "Father";

        StringBuffer sb12 = new StringBuffer(word);
        String revWord  = sb12.reverse().toString();

        if( word.equalsIgnoreCase(revWord)){
            System.out.println("palindrome");

        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
}
