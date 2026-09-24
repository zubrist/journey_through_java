package string;

public class stringwithnew {
    public static void main(String[] args) {
        String str3 = new String("Hello World!");

        System.out.println("Your 3rd String is: "+ str3);

        String str4 = new String("Hello World!");
        System.out.println("Your 4th String is: "+ str4);


        // checking with == operator
        System.out.println("str == str2 (new keyword): " + (str3 == str4)); // fasle (they are in the heap)

        System.out.println("Identity Hash of str3: " + System.identityHashCode(str3));

        System.out.println("Identity Hash of str4: " + System.identityHashCode(str4));
    }
}
