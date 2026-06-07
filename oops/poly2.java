package oops;

class Animal{
    void sound(){
        System.out.println("The Animal is making sound");
    }
}


class Dog extends Animal{
    
    // void sound(){
    //     System.out.println("The Animal is making sound");
    // }

    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
   // void sound(){
    //     System.out.println("The Animal is making sound");
    // }
}

public class poly2 {
    public static void main(String[] args) {
        Animal a1 = new Dog(); 

        a1.sound();

        Animal a2 = new Cat();

        a2.sound();
    }
    
}
