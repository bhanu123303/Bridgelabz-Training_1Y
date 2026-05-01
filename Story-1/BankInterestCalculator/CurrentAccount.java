package com.BankInterestCalculator;

public class CurrentAccount extends Account{
    public CurrentAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    public double calculateInterest(){
        return balance*0.2;
    }
}
