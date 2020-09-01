package com.company;

public class Main {

    public static void main(String[] args) {
       BankAccount myAccount = new BankAccount(4200, 173123, "Stephanie Rodriguez");
        System.out.println(myAccount.accountDetails());
        myAccount.deposit(500);
        System.out.println(myAccount.accountDetails());
        myAccount.withdraw(150);
        System.out.println(myAccount.accountDetails());
    }
}
