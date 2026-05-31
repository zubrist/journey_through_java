package array;

public class mulDimArray {
    public static void main(String[] args) {

        int row = 3 ;
        int col = 3 ;

        int matrix[][] = {
                        {1,2,4},
                        {5,6,7},
                        {8,9,10}
                        };
        
        // int twoDArray [][] = new int[2][2];
                        
        // twoDArray[0][1] = 5;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.err.println();
        }
    }
}
