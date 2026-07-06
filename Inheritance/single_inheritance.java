package Inheritance;

class ChinaPhone {

    int battery = 8000;

    void camera(){
        System.out.println("This is 20x Zoom Camera Phone.");
    }

    void battery(){
        System.out.println("ChinaPhone phone has " + battery +"mah power" );
    }
}

class AiNovaPhone extends ChinaPhone{

    int battery = 6000; // variable overload 

    void camera(){
        System.out.println("This is 200x Digital Zoom camera phone."); // method overridding 
    }

    void battery(){
        System.out.println("Nova  phone has " + battery +"mah power" );
    }
}


public class single_inheritance {
    public static void main(String[] args) {
        AiNovaPhone nova = new AiNovaPhone();
        nova.camera();
        nova.battery();

        ChinaPhone  cp = new ChinaPhone();
        cp.camera();
        cp.battery();

        
    }
}
