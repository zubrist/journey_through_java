package Array;

public class prog2 {
    public static void main(String[] args) {
        
        double myArray[] = new double[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random()*100;
        }

        // printign the array 

        for (int i = 0; i < myArray.length; i++) {
            System.out.println( myArray[i] + " ");
        }


        int myIntArray[] = new int[10];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = (int) (Math.random() * 100) ; // 47.74399226676292 => 47
        }
        /*
        (int) Math.random* 100 =  (int)0.5  = 0 => 0 * 100 = 0
        (int) (Math.random* 100) = (int)  (0.5 *100) = (int) (50.0) = 50
        */
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print( myIntArray[i] + "|");
        }
    }
}
