package com.BankInterestCalculator;

public class Account {
    int accountNumber;
    double balance;
    static String BankName="ICIC Bank";
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double calculateInterest(){
        return 0.0;
    }
    public void displayDetail(){
        System.out.println("Account Number :- "+accountNumber+" Balance :-"+balance);
    }
}
