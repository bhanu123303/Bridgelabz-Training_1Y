package com.thread.BankAccountSimulation;

public class BankAccount implements Runnable {
     String name;
     String AccountType;

    public BankAccount(String name, String  AccountType) {
        this.name = name;
        this.AccountType=AccountType;
    }

    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println("Accountholder name "+name+"Accounttype "+AccountType);
            System.out.println("---------------------------------------------------------------------------");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("*****************************************************************************");
    }
}