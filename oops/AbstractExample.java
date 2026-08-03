package oops;

// Abstract Class Accounts
abstract class Accounts {
    // Data Members
    double balance;
    String accountNumber;
    String accountHoldersName;
    String address;

    // Setter methods to initialize data members
    public void setDetails(double balance, String accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    // Abstract Methods
    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    // Concrete Method to display account details
    public void display() {
        System.out.println("----------------------------------");
        System.out.println("Account Number       : " + accountNumber);
        System.out.println("Account Holder Name  : " + accountHoldersName);
        System.out.println("Address              : " + address);
        System.out.println("Current Balance      : $" + balance);
        System.out.println("----------------------------------");
    }
}

// Subclass SavingsAccount
class SavingsAccount extends Accounts {
    // Data Member
    double rateOfInterest;

    // Setter method for rate of interest
    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    // Implementing withdraw method
    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Withdrawal failed: Invalid amount or insufficient balance.");
        }
    }

    // Implementing deposit method
    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
           // System.out.println("Successfully deposited $" + amount);

            System.out.printf("Successfully deposited : %.2f\n", amount); // the C ways

            String formatted = String.format("%.2f", amount); // the Java way
            System.out.println(formatted);   

            System.out.println("Updated balance:" + balance);
        } else {
            System.out.println("Deposit failed: Amount must be greater than zero.");
        }
    }

    // Method to calculate total amount including interest over a given time (in years)
    public void calculateAmount(int years) {
        double interest = (balance * rateOfInterest * years) / 100;  // I = PRT/100 =
        double totalAmount = balance + interest;
        System.out.println("Rate of Interest     : " + rateOfInterest + "%");
        System.out.println("Calculated Interest  : $" + interest + " for " + years + " year(s)");
        System.out.println("Total Amount         : $" + totalAmount);
    }
}

// Main class to test the program
public class AbstractExample {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        SavingsAccount myAccount = new SavingsAccount();

        // Assigning values using setter methods
        myAccount.setDetails(5000.00, "SA-987654", "Alice Smith", "456 Elm Street");
        myAccount.setRateOfInterest(4.5);

        // Display initial details
        myAccount.display();

        // Perform deposit
        myAccount.deposit(1500.00);

        // Perform withdrawal
        myAccount.withdraw(2000.00);

        // Calculate amount with interest for 2 years
        myAccount.calculateAmount(2);

        // Display final balance
        myAccount.display();
    }
}
