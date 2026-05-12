package operators;

public class ternaryOperator {
    public static void main(String[] args) {
        
        int num = 6 ;
        // variable = (condition) ? expression1 : expression2;
        char result = (num % 2 == 0) ? 'E' :  'O' ;
        System.out.println(result);
    }
}
