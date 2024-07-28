/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*encapsulation Problem: Create a BankAccount class with private attributes for accountNumber, balance, and accountHolder. 
Provide public methods to deposit, withdraw, and check the balance. Ensure that the balance cannot be set directly from outside
the class. */
package OOP_topics.Encapsulation;

/**
 *
 * @author Abdul Rafay
 */
class BankAccount {

    private long account_number;
    private int balance;
    private String account_holder;

    public BankAccount(String account_holder, int balance) {

        this.account_holder = account_holder;
        this.balance = balance;
        this.account_number = generateAccountNumber();
    }

    public long generateAccountNumber() {
        return (long) (Math.random() * 9000000000L) + 1000000000L;
    }

    public void deposit(int amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println(account_holder + " Deposit  $" + amount + " Current balance is $" + balance);
        } else {
            System.out.println("invalid amount ");
        }

    }

    public void withdraw(int amount) {

        if (amount > 0 && balance >= amount) {

            balance -= amount;
            System.out.println(account_holder + " Withdraw  $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("insufficient balance!");
        }

    }

    public int getBalance() {
        return balance;
    }

    public long getAccount_number() {
        return account_number;
    }

}

public class Customer_account {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Abdul Rafay", 1000000);

        account1.deposit(200000);
        account1.withdraw(500);

        System.out.println("Account Number: " + account1.getAccount_number() + ", balance: $" + account1.getBalance());

    }

}
