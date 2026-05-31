package loops;

public class fascinating{
    public static void main(String[] args) {
        
        int num = 194;

        int num2 = 192 *2 ; // 384

        int num3 = 192 *3 ; // 576

        // 192 + 384 + 576 => add

        String result = " " + num + num2 + num3; // "192" + 384 = "192384" + 576 = "192384576"


        boolean fascinating = true ;

        for (int i = 1; i <= 9; i++) // 1  => index + "" -> "1"  

        {   // i = "2"
            if( result.indexOf(i + "") == -1 || result.indexOf(i + "") != result.lastIndexOf(i +"")  ) // false || false 
                {
                      fascinating = false;  
                }
            // result.indexOf(index + "") => index or -1
        }

        if(fascinating)
        {
            System.out.println(num + " is a Fascinating Number");
        }
        else
        {
            System.out.println(num + " is not a fascinating Number");
        }

    }
} 



//   ComputerSciencer  : indexOf(er) => 6   || lastIndexOf(er) = 14