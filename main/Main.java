package com.galaxe.main;
import com.galaxe.customer.*;
import com.galaxe.bank.*;
public class Main {
    public static void main(String[] args) {
        // Creating bank customers
        Customer customer1 = new Customer("Narendra", "JNTU Kakinada", "9493990003");
        Customer customer2 = new Customer("Narasimha", "JNTU Kakinada", "9870017120");
        Customer customer3 = new Customer("Umesh", "JNTU Kakinada", "8054787879");
        
        
        // Creating bank accounts
        Account account1 = new Account("001", customer1, 1000.00);
        Account account2 = new Account("002", customer2, 2000.00);
        Account account3 = new Account("003", customer3, 5000.00);
        

        // Creating a bank
        Bank bank1 = new Bank("HDFC Bank", 10);
        Bank bank2= new Bank("SBI",15);

        // Adding accounts to the bank
        bank1.addAccount(account1);
        bank1.addAccount(account2);
        bank2.addAccount(account3);

        // Displaying accounts in the bank
        bank1.displayAccounts();
        bank2.displayAccounts();

        // Depositing and withdrawing money from accounts
        account1.deposit(500.00);
        account2.withdraw(1000.00);
        account3.withdraw(1000.00);
        
        System.out.println();
        System.out.println("After some Transactions");
        System.out.println();

        // Displaying updated account balances
        bank1.displayAccounts();
        bank2.displayAccounts();
        
        
    }
}
