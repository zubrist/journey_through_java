package Interface;

// Interface class starts with the keyward interface

interface Animal{
    void sound(); // this is my abstract method and any class that has an abstract method is called abstract class 
}


class Dog implements Animal {
    public void sound(){
        System.out.println("Dog is Barking...");
    }
}


public class interfaceExample1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}
