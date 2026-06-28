package string;

public class example5 {
    public static void main(String[] args) {
        // equals(String anotherString) : checks whether two strings have the same sequence of characters.

        String one = "abcd";
        String two = "ABCD";
        String three = "efgh";
        String four = "abcd";

        System.out.println(one.equals(four));
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));

        // equalIgnireCase()
        System.out.println(one.equalsIgnoreCase(two));

    }
}
