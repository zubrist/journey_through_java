package string;

public class replacemethod {
    public static void main(String[] args) {
        String str = "Computer Science";
        System.out.println("Original: "+ str);

        String updatedStr = str.replace('e','v');
        System.out.println("After char replacement: "+ updatedStr);

        String str2 = "It was my Blood, Its too Red to see!";

        System.out.println("original:" + str2);

        String updatedStr2 = str2.replace("oo", "ee" );
        // String updatedStr2 = str2.replace("oo", "ee");

        System.out.println("After Secquenec replacement: "+ updatedStr2);
    }
    
}
