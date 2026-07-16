/*
Create a abstract class “Employee” having abstract method  “getsalary()” .  Create another classes
“Hourly_Salary”  and  “Daily_Salary” which have instance variables name and salary, These classes
overrides getsalary() methods to calculate salary on hourly basis or daily basis and print name with
salary. Use appropriate method or constructor to take input name, hour_worked/no_of_days from
user.

Do the same , Keep the question as it in in the top
*/

package Assignments;

import java.util.Scanner;

public class assignment10 {

    // Abstract Employee class
    public static abstract class Employee {
        protected String name;
        public Employee(String name) { this.name = name; }
        // compute and return salary
        public abstract double getsalary();
        // print name and salary
        public void printPay() {
            System.out.printf("%s : %.2f\n", name, getsalary());
        }
    }

    // Hourly salary: salary = hourlyRate * hoursWorked
    public static class Hourly_Salary extends Employee {
        private double hourlyRate;
        private double hoursWorked;
        public Hourly_Salary(String name, double hourlyRate, double hoursWorked) {
            super(name);
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }
        @Override
        public double getsalary() {
            return hourlyRate * hoursWorked;
        }
    }

    // Daily salary: salary = dailyRate * noOfDays
    public static class Daily_Salary extends Employee {
        private double dailyRate;
        private int noOfDays;
        public Daily_Salary(String name, double dailyRate, int noOfDays) {
            super(name);
            this.dailyRate = dailyRate;
            this.noOfDays = noOfDays;
        }
        @Override
        public double getsalary() {
            return dailyRate * noOfDays;
        }
    }

    // Demo and interactive input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Demo: Hourly and Daily salary calculations");

        // sample
        Hourly_Salary hsample = new Hourly_Salary("Alice", 15.0, 40);
        Daily_Salary dsample = new Daily_Salary("Bob", 120.0, 20);
        System.out.print("Sample Hourly: "); hsample.printPay();
        System.out.print("Sample Daily : "); dsample.printPay();

        System.out.println();
        System.out.println("Interactive input:");
        System.out.println("Enter type (hourly/daily):");
        String type = sc.next();
        sc.nextLine();
        if (type.equalsIgnoreCase("hourly")) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter hourly rate (double):");
            double rate = sc.nextDouble();
            System.out.println("Enter hours worked (double):");
            double hours = sc.nextDouble();
            Hourly_Salary h = new Hourly_Salary(name, rate, hours);
            System.out.print("Result: "); h.printPay();
        } else if (type.equalsIgnoreCase("daily")) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter daily rate (double):");
            double rate = sc.nextDouble();
            System.out.println("Enter number of days (int):");
            int days = sc.nextInt();
            Daily_Salary d = new Daily_Salary(name, rate, days);
            System.out.print("Result: "); d.printPay();
        } else {
            System.out.println("Unknown type. Exiting.");
        }

        sc.close();
    }
}
