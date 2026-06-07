package oops;

public class Poly1 {
    public int  add(int a , int b){
        return a+b;
    }

    public double add(double a , double b)
    {
        return a+b;
    }



    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;


        double num3 = 23.4;
        double num4 = 21.7;

        Poly1 obj = new Poly1();

        //int res1 = obj.add(num1, num2);
        // System.out.println(res1);

        double res2 = obj.add(num3, num4);
        System.out.println(res2);
    }
}
