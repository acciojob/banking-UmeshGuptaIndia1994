package com.driver;

public class Main {

    public static void main(String[] args) {
        try {
            // Creating instances of different account types
            CurrentAccount currentAccount = new CurrentAccount("Umesh Gupta", 7000, "TRADE123");
            SavingsAccount savingsAccount = new SavingsAccount("Dinesh Gupta", 10000, 2000, 0.05);
            StudentAccount studentAccount = new StudentAccount("Ramdayal Gupta", 500, "ABC University");

            // Deposit and withdraw operations
            currentAccount.deposit(2000);
            currentAccount.withdraw(1500);

            savingsAccount.deposit(3000);
            savingsAccount.withdraw(800);

            studentAccount.deposit(100);

            // Validating trade license ID
            currentAccount.validateLicenseId();

            // Generating account numbers
            System.out.println("Generated Account Number: " + BankAccount.generateAccountNumber(6, 24));

            // Calculate and print simple and compound interest
            System.out.println("Savings Account Simple Interest after 3 years: " + savingsAccount.getSimpleInterest(3));
            System.out.println("Savings Account Compound Interest after 3 years: " + savingsAccount.getCompoundInterest(2, 3));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
