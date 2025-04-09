//Imports
package main.java.com.banking.app;

import java.util.*;


//Class
public class Bank {

    //Store bank accounts
    private List<Account> accounts = new ArrayList<>();  

    //Methods
    public void createAccount(String accountNumber, String holderName) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account with this number already exists!");
                return;
            }
        }
        
        accounts.add(new Account(accountNumber, holderName, 0.0)); 
        System.out.println("Account created successfully!");
    }

    
    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

}
