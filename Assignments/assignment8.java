/*
8. Demo for MyPoint class. Shows constructors, toString(), and three distance() overloads.
*/
package Assignments;

import java.util.Scanner;

public class assignment8 {
    public static void main(String[] args) {
        // Test cases
        MyPoint p1 = new MyPoint();
        System.out.println("p1 (default): " + p1 + " distance to origin=" + p1.distance());

        MyPoint p2 = new MyPoint(3,4);
        System.out.println("p2: " + p2 + " distance to origin=" + p2.distance());

        System.out.println("Distance p2 to (5,6): " + p2.distance(5,6));

        MyPoint p3 = new MyPoint(5,6);
        System.out.println("Distance p2 to p3: " + p2.distance(p3));

        // Interactive: read a point and compute distances
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x y for a point:");
        int x = sc.nextInt(); int y = sc.nextInt();
        MyPoint p = new MyPoint(x,y);
        System.out.println("You entered: " + p);
        System.out.println("Distance to origin: " + p.distance());
        System.out.println("Distance to p2 (3,4): " + p.distance(p2));
        sc.close();
    }
}
