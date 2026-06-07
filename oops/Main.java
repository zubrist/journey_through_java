package oops;

class Student {
    // attributes 
    String name;
    int rollNumber;
    
    // behaviour / actions 
    void showDetails()
    {
        System.out.println("Name: " +name);
        System.out.println("Roll: " +rollNumber);
    }
}



public class Main {
    public static void main(String[] args) {

        Student st1 = new Student();// object of the Student class

        st1.name = "Reja";
        st1.rollNumber = 9;


        Student st2 = new Student();

        st2.name = "Rajesh";
        st2.rollNumber= 12;


        st1.showDetails();
        st2.showDetails();
    }

    
}