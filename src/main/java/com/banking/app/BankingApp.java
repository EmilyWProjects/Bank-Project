//Imports
package main.java.com.banking.app;

import java.util.Scanner;

//Class
public class BankingApp {
    public static void main(String[] args) {

        //Setup 
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        String accountNumber, holderName;
        double amount;
        Account account;  

        //Menu
        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            //Call methods
            switch (choice) {

                case 1:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    holderName = scanner.nextLine();
                    bank.createAccount(accountNumber, holderName);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        amount = scanner.nextDouble();
                        account.deposit(amount);
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        amount = scanner.nextDouble();
                        if (account.withdraw(amount)) {
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextLine();
                    account = bank.getAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Account Information:");
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Holder: " + account.getHolderName());
                        System.out.println("Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using this bank. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

}
