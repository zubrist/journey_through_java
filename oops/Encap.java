package oops;

// encapsulation is achieved by using the keyword -> private
class Emp {
   private String name ;
   private double salary;

    // setter and getter

    public void setName(String s)
    {
        name = s;
    }

    public void setSalary(double d)
    {
        salary = d;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
}


public class Encap {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        // e1.name = "priya";
        // e1.salary = 124224.34;
        e1.setName("Reja");
        System.out.println(e1.getName());


        // Emp e2 = new Emp();
        // e2.name = ""


        
        
    }
    
}
