package Array;

public class prog4 {
    public static void main(String[] args) {
        // print the max of the elements 

        int maxArray[] = new int[10]; 
        int max = maxArray[0];

        for (int i = 0; i < maxArray.length; i++) {
            maxArray[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < maxArray.length; i++) {
            System.out.print(maxArray[i] + "|");
        }
        System.out.println(""); // just a new line
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i]> max) // maxArray[9] > maxArray[7] =false
            {
                max= maxArray[i]; // max = maxArray[7]
            }

        }
        System.out.println("Max element: " + max);
    }
}
