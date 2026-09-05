package Array;

import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        //  first array

        double firstArray [] = new double[10];

        /*
        | 0 | 0 | 0 | 0 |  |  |  |  |  |  |  |  |
        
        */

        firstArray[0] = 12.3;
        firstArray[1] = 2;
        firstArray[2] = 5; 

        // ... 

        // -----------------------------------------

        // Declaring, creating, and initializing in one step
        int secondArray[] = {2,5,6,8,9,12,24};


        // ---------------------------------------------------

        int thirdArray[] = new int[10];

        // Initializing arrays with input values

        Scanner input = new Scanner(System.in); // to take the lenght of the array 

        System.out.println("Enter " + thirdArray.length + " values: ");;

        for ( int i = 0 ; i < thirdArray.length; i++  ) // 10 < 10 is false
        {
            thirdArray[i] = input.nextInt();
        }

        // -------------------------------------------------------------

        double forthArray[] = new double[100];

        // Initializing arrays with random values

        for (int i = 0; i < forthArray.length; i++) {
            forthArray[i] = Math.random() * 100;   // random() = 0 -> 1 => 0.5 * 100
        }




    }
}
