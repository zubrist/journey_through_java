/*
Suppose you have and interface  “Polygon” that has two methods “ getArea()” and “getVolume()”. 
Create two classes “Cube” and “Sphere” that implements these methods to calculate the area and 
volume of cube and sphere respectively. 
*/

package Assignments;

import java.util.Scanner;

public class assignment11 {

    public static interface Polygon {
        double getArea();
        double getVolume();
    }

    public static class Cube implements Polygon {
        private double side;
        public Cube(double side) { 
            this.side = side; 
        }
        @Override
        public double getArea() { 
            return 6.0 * side * side;
         }
        @Override
        public double getVolume() { 
            return side * side * side; 
        }
        

        public String toString() 
        { 
            return String.format("Cube(side=%.4f)", side); 
        }
    }

    public static class Sphere implements Polygon {
        private double r;
        public Sphere(double r) {
             this.r = r; 
            }
        @Override
        public double getArea() { 
            return 4.0 * Math.PI * r * r; 
        }
        @Override
        public double getVolume() { 
            return (4.0/3.0) * Math.PI * r * r * r; 
        }
        @Override
        public String toString() {
             return String.format("Sphere(r=%.4f)", r); 
            }
    }

    public static void main(String[] args) {
        // Samples
        Cube c = new Cube(3.0);
        Sphere s = new Sphere(2.0);
        System.out.println(c + " Area=" + c.getArea() + " Volume=" + c.getVolume());
        System.out.println(s + " Area=" + s.getArea() + " Volume=" + s.getVolume());

        // Interactive
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape (cube/sphere):");
        String shape = sc.next();
        if (shape.equalsIgnoreCase("cube")) {
            System.out.println("Enter side length:");
            double a = sc.nextDouble();
            Cube cc = new Cube(a);
            System.out.println(cc + " Area=" + cc.getArea() + " Volume=" + cc.getVolume());
        } else if (shape.equalsIgnoreCase("sphere")) {
            System.out.println("Enter radius:");
            double r = sc.nextDouble();
            Sphere ss = new Sphere(r);
            System.out.println(ss + " Area=" + ss.getArea() + " Volume=" + ss.getVolume());
        } else {
            System.out.println("Unknown shape");
        }
        sc.close();
    }
}
