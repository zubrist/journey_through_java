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

class SmartPhone extends BasicPhone{

    int battery = 5000;

    void internet(){
        System.out.println("Your Smartphone has Interner now , ENJOY!");
    }

    void batteryInfo(){
        System.out.println("Basic phone has " +battery+"mAh battery");
    }
}

class AiNova extends SmartPhone{
    int battery = 6000;

    void batteryInfo(){
        System.out.println("Basic phone has " +battery+"mAh battery");
    }

    void cameraInfo(){
        System.out.println("Nova has Build in AI in camera");
    }
}




public class multilevel_inheritance {
    public static void main(String[] args) {

    AiNova nova = new AiNova();

    nova.call();
    nova.internet();
    nova.cameraInfo();
    nova.batteryInfo();
    }
}
