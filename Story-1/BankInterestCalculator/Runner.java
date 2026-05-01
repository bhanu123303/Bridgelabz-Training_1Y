package com.BankInterestCalculator;

public class Runner {
    static void main(String[] args) {
        System.out.println("Welcome to ICIC Bank");
        System.out.println("Here is your bank detail");
        Account a1=new CurrentAccount(12,55000);
        Account a2=new SavingAccount(67,100000);
        a1.displayDetail();
        System.out.println("Total Amount of CurrentAccount :-"+a1.calculateInterest());
        a2.displayDetail();
        System.out.println("Total Amount of SavingAccount :-"+a2.calculateInterest());
    }
}
