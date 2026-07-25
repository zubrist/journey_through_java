package Exception;

/*

Java provides a robust and structured way to handle runtime errors through its exception handling mechanism. 
It ensures the smooth execution of a program even when an unexpected situation occurs.
*/

public class tryCatchBlocks {
    public static void main(String[] args) {
        

    // try block    
    /*
    The try block in Java is used to wrap code that might throw an exception. 
    If an exception occurs within the try block, the control immediately transfers to the matching catch block.
    */
    

    try {
        int number = 10 / 0; 
    } catch (Exception e) {
       System.out.println(e.getMessage());
       System.out.println(e);
       e.printStackTrace();
    }


    }
}
