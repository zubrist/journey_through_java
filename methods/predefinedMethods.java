package methods;

public class predefinedMethods {

    public static void main(String[] args) {
        String name = "Ahmed Reja";

        String a1 = "mom";
        String a2 = "MOM";

        // println()
        System.out.println(name);

        // length()
        System.out.println("length of name: "+ name.length());

        //toUpperCase()
        System.out.println("Upper Case:" +name.toUpperCase());

        System.out.println(a1.equalsIgnoreCase(a2));
    }
    
}
