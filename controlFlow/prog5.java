// swith-case

package controlFlow;

public class prog5 {
    public static void main(String[] args) {
        int a = 10 , b = 20 ;

        // ask user to provide operator

        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println("sum of the values: " + (a+b));
                break;
            case '-':
                System.out.println("diff of the values: " + (a-b));
                break;

            case '*':
                System.out.println("product of the values: " + (a*b));
                break;    

            case '/':
                System.out.println("division of the values: " + (a/b));
                break;     
            default:
                System.out.println("Wrong Operator");
                break;
        }
    }
    
}
