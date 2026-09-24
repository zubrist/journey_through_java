package array;

public class bubbleSort {
   public static void main(String[] args) {
    int dataArray[] = new int[10]; 
        
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + "|");
        }
        System.out.println(""); // just a new line

        int len = dataArray.length;
        System.out.println(len);

        // sorting
        for(int i=len-1; i>0; --i ) // for the steps
        {

            for(int j=0 ; j<i ; j++) // for iterations
                {
                    if(dataArray[j]>dataArray[j+1])   {
                        int temp = dataArray[j];
                        dataArray[j] = dataArray[j+1];
                        dataArray[j+1] = temp;
                    }
                } 
        }
        // sorting end
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + "|");
        }
   }
    
}
