package array;

public class selectionSort {
    public static void main(String[] args) {
        int dataArray[] = new int[10]; 
        int i = 0 , j =0;
        for (i = 0; i < dataArray.length; i++) {
            dataArray[i] = (int)(Math.random()*100);
        }

        for ( i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + "|");
        }
        System.out.println(""); // just a new line
        int len = dataArray.length;

        // sorting
        for( i=0; i<len-1; i++){
            int min = i;
            for( j=i;j<len;j++ ){
                if(dataArray[j]< dataArray[min]){
                    min= j;
                }
            }
            int temp = dataArray[i];
            dataArray[i] = dataArray[min];
            dataArray[min] = temp;
        }
        // sorting end
        for ( i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + "|");
        }
    }
}
