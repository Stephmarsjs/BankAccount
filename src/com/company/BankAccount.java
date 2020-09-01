package com.company;

public class BankAccount {
    private int balance;
    private int accountNumber;
    private String accountHolder;

    public BankAccount(int balance, int accountNumber, String accountHolder) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    public void getBalance() {
        System.out.println("You have a balance of " + balance);
    }
    public void withdraw(int amt) {
      if (balance >= amt) {
          balance -= amt;
      }
      return;
    }
    public void deposit(int amt) {
        balance += amt;
    }
    public String accountDetails() {
        return "\taccount Holder: " + accountHolder + "\tAccount Number: " + accountNumber + "\tbalance: " + balance;
    }
}

class CheckingAccount extends BankAccount {
    public int interestRate;
    private CheckingAccount(int balance, int accountNumber, String accountHolder, int interestRate) {
        super(balance, accountNumber, accountHolder);
        this.interestRate = interestRate;

    }
}
