package Inheritance;

class BasicPhone{
    int battery = 3000;

    void call(){
        System.out.println("Say Hello , when you pic the Basic call.");
    }

    void batteryInfo(){
        System.out.println("Basic phone has " +battery+"mAh battery");
    }
}

// Child Class 1
class AiNovaX extends BasicPhone{
    int battery = 6000;

    @Override  // annotation
    void batteryInfo(){
        System.out.println("Basic phone has " +battery+"mAh battery");
    }

    void cameraInfo(){
        System.out.println("Nova has Build in AI in camera");
    }

    void manufacturer(){
        System.out.println("This is manufactured in China.");
    }
}

// Child Class 2 

class Galaxy extends BasicPhone{
    int battery = 7000;

    void cameraInfo(){
        System.out.println("Galaxy25 has Build in AI in camera");
    } 

    void sPen(){
        System.out.println("S-Pen has 78% charge");
    }
    
}


public class hierarchical_inheritance {
    public static void main(String[] args) {
        
        AiNovaX nova = new AiNovaX();
        Galaxy s25 = new Galaxy();


        nova.call();
        nova.batteryInfo();
        nova.cameraInfo();
        nova.manufacturer();
        //nova.sPen(); // Error -> method Undefined 

        s25.call();
        s25.batteryInfo();
        s25.cameraInfo();
        s25.sPen();
       // s25.manufacturer(); // Error -> method Undefined 
    }
}
