package methods;

public class userDefinedMethods {

    public int Sum(int a, int b ){
        return a+b;
    }

    public boolean isEven(int num){
            return num%2 == 0 ;
    }

    public static void main(String[] args) {

        userDefinedMethods udm    =  new userDefinedMethods(); 
        // className     objectName       constructor
        
        int add = udm.Sum(10, 20);

        System.out.println("Summation of 10 and 20 is : "+add);

        int number = 7;


        System.out.println("Is " + number + " even? : " + udm.isEven(number));
        
    } 

}
