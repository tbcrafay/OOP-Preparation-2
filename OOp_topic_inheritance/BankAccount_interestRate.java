/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*inheritance problem:
Create a SavingsAccount class that inherits from BankAccount. A SavingsAccount should have an additional attribute for 
interestRate. Override the deposit() method in SavingsAccount to automatically add interest to the deposited amount.
*/

package OOp_topic_inheritance;

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

    public String getAccount_holder() {
        return account_holder;
    }
    
}

class SavingAccounts extends BankAccount {

    private double interestRate;
    
    public SavingAccounts(String account_holder, int balance, double interestRate){
    
        super(account_holder,balance);
        this.interestRate=interestRate;
        
    }
    
    @Override
    public void deposit(int amount){
    
        super.deposit(amount);
        
        double interest = amount * (interestRate/100);
        super.deposit((int)interest);
        System.out.println("Interest added: $" + interest);
    }
}
public class BankAccount_interestRate {
    public static void main(String[] args) {
        SavingAccounts savingsAccount = new SavingAccounts("John Doe", 2000, 2.5);
        savingsAccount.deposit(200);
                // Check the balance
        System.out.println("Account Holder: " + savingsAccount.getAccount_holder());
        System.out.println("Account Number: " + savingsAccount.getAccount_number());
        System.out.println("Current Balance: $" + savingsAccount.getBalance());

    }
}
