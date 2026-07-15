/*
7. Menu-driven program that uses the COMPLEX class to perform operations:
   - magnitude()
   - argument()
   - add(A,B)
   - subtract(A,B)
   - conjugate() (on an instance)

   Simple menu with two sample COMPLEX numbers and interactive choices.
*/
package Assignments;
import Assignments.COMPLEX;
import java.util.Scanner;

public class assignment7 {

    private static void printMenu() {
        System.out.println("--- COMPLEX Number Menu ---");
        System.out.println("1. Show sample complex numbers");
        System.out.println("2. Magnitude of a complex number");
        System.out.println("3. Argument of a complex number (radians)");
        System.out.println("4. Add two complex numbers (A + B)");
        System.out.println("5. Subtract two complex numbers (A - B)");
        System.out.println("6. Conjugate a complex number");
        System.out.println("7. Exit");
        System.out.print("Choose option: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // two sample complex numbers
        COMPLEX A = new COMPLEX(3.0, 4.0); // magnitude 5
        COMPLEX B = new COMPLEX(-1.5, 2.0);
        COMPLEX R = new COMPLEX(); // result holder

        while (true) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Sample A = " + A);
                    System.out.println("Sample B = " + B);
                    break;
                case 2:
                    System.out.println("Enter real and imag for the complex number:");
                    double r1 = sc.nextDouble();
                    double i1 = sc.nextDouble();
                    COMPLEX t1 = new COMPLEX(r1, i1);
                    System.out.println("Magnitude = " + t1.magnitude());
                    break;
                case 3:
                    System.out.println("Enter real and imag for the complex number:");
                    double r2 = sc.nextDouble();
                    double i2 = sc.nextDouble();
                    COMPLEX t2 = new COMPLEX(r2, i2);
                    System.out.println("Argument (radians) = " + t2.argument());
                    break;
                case 4:
                    System.out.println("Enter A (real imag):");
                    double ar = sc.nextDouble(); double ai = sc.nextDouble();
                    System.out.println("Enter B (real imag):");
                    double br = sc.nextDouble(); double bi = sc.nextDouble();
                    COMPLEX AA = new COMPLEX(ar, ai);
                    COMPLEX BB = new COMPLEX(br, bi);
                    R.add(AA, BB);
                    System.out.println("A + B = " + R);
                    break;
                case 5:
                    System.out.println("Enter A (real imag):");
                    double sr = sc.nextDouble(); double si = sc.nextDouble();
                    System.out.println("Enter B (real imag):");
                    double tr = sc.nextDouble(); double ti = sc.nextDouble();
                    COMPLEX AS = new COMPLEX(sr, si);
                    COMPLEX BS = new COMPLEX(tr, ti);
                    R.subtract(AS, BS);
                    System.out.println("A - B = " + R);
                    break;
                case 6:
                    System.out.println("Enter real and imag for the complex number:");
                    double cr = sc.nextDouble(); double ci = sc.nextDouble();
                    COMPLEX C = new COMPLEX(cr, ci);
                    C.conjugate();
                    System.out.println("Conjugate = " + C);
                    break;
                case 7:
                    sc.close();
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
    }
}
