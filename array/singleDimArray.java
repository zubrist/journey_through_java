package array;

public class singleDimArray {

    public static void main(String[] args) {
        
        int marks [] = new int[5];

        marks[0] = 45;
        marks[1] = 55;
        marks[2] = 95;
        marks[3] = 85;
        marks[4] = 50;
        

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i+1)+ " : " + marks[i]);
        }
        

    }
}
