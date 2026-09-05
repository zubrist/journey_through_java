package Array;

public class prog6 {
    public static void main(String[] args) {
        int row = 3;
        int col = 5;
        int twoDArray [][]= new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoDArray[i][j] = (int)(Math.random() *100);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(twoDArray[i][j] + " "); // 91 81 84
            }
            System.out.println("");
        }

    }
}
