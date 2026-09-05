package Array;

public class prog3 {
    public static void main(String[] args) {
        // finding the total of array elements 

        int sumArray[] = new int[10];
        int total = 0;

        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + "|");
        }

        for (int i = 0; i < sumArray.length; i++) {
            total += sumArray[i];  // 0 + sumArray[0] + sumArray[1] + sumArray[2]+ ..... + sumArray[9]
        }
        System.out.println(" Total of all elemets: " + total);
    }
}
