package stringBuffer;


/*

replace() method replaces the given string from the specified beginIndex and endIndex-1.
*/
public class sbReplace {
    public static void main(String[] args) {
        StringBuffer sb8 = new StringBuffer("Hello");

        sb8.replace(2, 4, "FF");
        System.out.println(sb8);
        
    }
     
}