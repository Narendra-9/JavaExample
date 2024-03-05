package com.galaxe.bank;

public class Bank {
    private String name;
    private Account[] accounts;
    private int numOfAccounts;

    // Constructor
    public Bank(String name, int maxAccounts) {
        this.name = name;
        accounts = new Account[maxAccounts];
        numOfAccounts = 0;
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        if (numOfAccounts < accounts.length) {
            accounts[numOfAccounts] = account;
            numOfAccounts++;
        } else {
            System.out.println("Cannot add more accounts, maximum limit reached");
        }
    }

    // Method to display all accounts in the bank
    public void displayAccounts() {
        System.out.println("Accounts in " + name + ":");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < numOfAccounts; i++) {
            System.out.println("Account Number: " + accounts[i].getAccountNumber() +
                               ", Customer: " + accounts[i].getCustomer().getName() +
                               ", Balance: " + accounts[i].getBalance());
        }
        System.out.println("-----------------------------------------------------------");
    }
}