package stringBuffer;

/*
append() Method
    - append() method concatenates the given argument with this string.
*/
public class sbAppend {
    public static void main(String[] args) {
        StringBuffer sb3 = new StringBuffer("hello");

        sb3.append("World");

        System.out.println(sb3);


        StringBuffer sb4 = new StringBuffer(5);
        sb4.append("Computer Science");
        /*
         StringBuffer automatically recalculates and increases its internal capacity using a specific formula:
                New Capacity = (Old Capacity * 2) + 2
        */
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer();
        sb5.append("Java Classes");

        System.out.println(sb5);



    }
}
