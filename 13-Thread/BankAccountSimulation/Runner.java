package com.thread.BankAccountSimulation;
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=sc.nextDouble();
        if(balance>100000) {
            BankAccount user1 = new BankAccount("Khushi ", " Premium");
            Thread t1=new Thread(user1);
            t1.setPriority(10);
            t1.start();
        }else if(balance>50000){
            BankAccount user2=new BankAccount("Ram "," Regular");
            Thread t2=new Thread(user2);
            t2.setPriority(5);
            t2.start();
        }else{
            BankAccount user3=new BankAccount("Shayam "," Basic");
            Thread t3=new Thread(user3);
            t3.setPriority(1);
            t3.start();
        }

    }
}
