package stringBuffer;


/*

setlength(int newLength): this method used to set the length of the character sequence equal to newLength.
*/
public class sbSetLength {
    public static void main(String[] args) {
        StringBuffer sb16 = new StringBuffer();
        sb16.append("Computer Sceince ..........");
        System.out.println(sb16 + " |  len :" + sb16.length() + " | Cap :" + sb16.capacity());

        sb16.setLength(8);

        System.out.println(sb16 + " |  len :" + sb16.length() + " | Cap :" + sb16.capacity());

    }
}
