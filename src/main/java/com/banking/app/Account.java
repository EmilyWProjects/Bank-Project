//Imports
package main.java.com.banking.app;

//Class
public class Account {

    //Constructor
    private String accountNumber;
    private String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    //Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true; 
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false; 
        }
    }

    public double getBalance() {
        return balance; 
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

}