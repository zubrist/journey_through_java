package Inheritance;

class Payments{
    void process(){
        System.out.println("Payment is processing....");
    }
}
class creditCards extends Payments{
    @Override
    void process(){
        System.out.println("Enter Credit information to continue payment...");
    }

}

class UPIs extends Payments{
    @Override
    void process(){
        System.out.println("Scan the QR to make payment...");
    }
}
class Cash extends Payments{
    @Override
    void process(){
        System.out.println(" Paying in CASH ...");
    }
}

public class after_dmd {
    public static void main(String[] args) {

          String paymentMode = "cash";

          Payments myPayment;

        //   ParentClass objName = new ChildClass()
        
        if( paymentMode.equalsIgnoreCase("UPI"))
        {
            myPayment = new UPIs();
        }
        
        else if (paymentMode.equalsIgnoreCase("Cash"))
        {
            myPayment = new Cash();
        }
        
        else
        {
            myPayment = new creditCards();
        }


       // we may add many more classes and there condion above 
       // but the below line will be unchanged 
        myPayment.process();
    }
}
