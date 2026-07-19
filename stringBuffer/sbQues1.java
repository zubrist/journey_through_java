package stringBuffer;

/* 

Write a Java program, to convert the string 'Great' to a new string 'Good'.

*/
public class sbQues1 {
    public static void main(String[] args) {
        StringBuffer sb8 = new StringBuffer("Great");
        sb8.replace(1, 4, "ood");
        // System.out.println(sb8);
        sb8.setLength(4);
        System.out.println(sb8);
    }
}
