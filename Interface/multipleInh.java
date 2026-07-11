package Interface;

interface CNG_Car{
    void drive();
    void cng_kit();
}

interface Petrol_Car{
    void drive();
    void petrol_kit();
}

class Hybrid_Car implements CNG_Car , Petrol_Car{
    public void drive(){
        System.out.println(" I am driving a Hybrid Car");
    }

    public void cng_kit(){
        System.out.println("Using CNG KIT ... ");
    }

    public void petrol_kit(){
        System.out.println("using petrol kit ...");
    }

}

public class multipleInh {
    public static void main(String[] args) {
        
        Hybrid_Car hc = new Hybrid_Car();
        hc.drive();
        hc.cng_kit();
        hc.petrol_kit();
    }
}
