package stringBuffer;

public class stringBuffer1 {

    
    /*
    StringBuffer(): This constructor helps us to create an empty StringBuffer of 16 characters having its initial capacity.

        StringBuffer(String str): This constructor will create a StringBuffer with the specified String.
        StringBuffer(int cap): This constructor will accept an integer argument that sets the size of the buffer.

    */

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        //  String sb = "Hello World"
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("THis is to check the capacity of the sb");
        System.out.println(sb2);



        
    }
    
}
