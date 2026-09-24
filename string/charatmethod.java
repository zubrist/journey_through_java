package string;

public class charatmethod {
    public static void main(String args[]){
      String name="Ahmed"; // |A|h|m|e|d|
      char ch=name.charAt(4);//returns char value at the 4th index  
      System.out.println(ch);

      // edge cases 
      char ch2=name.charAt(5);//returns char value at the 5th index  
      System.out.println(ch2);
      //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 5 out of bounds for length 5

    }
}
