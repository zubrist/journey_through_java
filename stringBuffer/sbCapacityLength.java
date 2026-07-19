package stringBuffer;

/*

capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. 
If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity * 2 ) + 2.
16 -> 34 -> 70 -> 142 
*/
public class sbCapacityLength {
    public static void main(String[] args) {
        StringBuffer sb12 = new StringBuffer("Capacity");

        System.out.println("Cap:"+ sb12.capacity()); // default = 16 , sb12= 8

        System.out.println("Len:" + sb12.length());

        StringBuffer sb13 = new StringBuffer(); // empty SB
        System.out.println("Cap:" +sb13.capacity());
        System.out.println("len:" +sb13.length());

        sb13.append("Computer Science and Engineering");
        System.out.println("Cap:" + sb13.capacity());
        System.out.println("Len:" +sb13.length());

        sb13.append(" I am Enjoying the Subject very much. ");
        System.out.println("Cap:" + sb13.capacity());
        System.out.println("Len:" + sb13.length());

    }
}
