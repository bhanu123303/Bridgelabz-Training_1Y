package com.BankInterestCalculator;

public class SavingAccount extends Account{
    public SavingAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    public double calculateInterest(){
        return balance*0.4;
    }
}
