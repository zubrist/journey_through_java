package stringBuffer;


/*
    insert() method inserts the given string with this string at the given position. 
*/
public class sbInsert {
    public static void main(String[] args) {
        StringBuffer sb7 = new StringBuffer("Computer");

        sb7.insert(0, "K");

        System.out.println(sb7);


        sb7.insert(6, "T");
        System.out.println(sb7);

        sb7.insert(10, "Science");
        System.out.println(sb7);
        
    }
}
