package string;

public class example8 {
    public static void main(String[] args) {
        //split(String regex) : splits the string around matches of the given regular expression and returns an array of substrings
        // name#$7875@domain.com

        String fruits ="apple,banana,grape,orange";
        String [] favFruits = fruits.split(",");

        for (String fruit : favFruits) {
            System.out.println(fruit);
            
        }
        System.out.println(" ");
        String data = "Alice, Bob;   Charlie   David, Eve;Frank,,Reja";
        String[] names = data.split("[,;\\s]+");

        System.out.println("Original: " + data);
        System.out.println("Split result:");
        for (String name : names) {
            System.out.println(name);

        }


    }
}
