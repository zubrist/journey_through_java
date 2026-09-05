package Array;

import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        
        // declare an two-dim array

        // datatype arrayName[][] =  new datatype [x-size][y-size]


        // =====================================================
        int twoDimArray[][] = new int[3][3];

        twoDimArray[0][0] = 3;
        twoDimArray[0][1] = 6;
        twoDimArray[0][2] = 8;
        twoDimArray[1][0] = 9;
        twoDimArray[1][1] = 3;
        twoDimArray[1][2] = 1;
        //.... upto [3][3]

        // ========================================================

        int twoDimArrays[][] = 
        {
            {2, 5, 6 },
            {1, 5, 7},
            {9, 10, 24}

        };

        // ========================================================


         int thirdArray[][] = new int[3][5];

        // Initializing arrays with input values

        Scanner input = new Scanner(System.in); // to take the lenght of the array 

        System.out.println("Enter " + thirdArray.length + " values: ");;

        for ( int i = 0 ; i < 3; i++  )
        {
            for (int j = 0 ; j < 5 ; j++){
                thirdArray[i][j] = input.nextInt();
            }
            
        }


        // ================================================================

        double forthArray[][] = new double[10][10];

        // Initializing arrays with random values

        for (int i = 0; i < 10; i++) {
            for ( int j = 0 ; j<10 ; j++){
                forthArray[i][j] = Math.random() * 100;   
            }
            
        }
    }
}
