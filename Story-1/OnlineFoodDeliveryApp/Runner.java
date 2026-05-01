package com.OnlineFoodDeliveryApp;

public class Runner {
    static void main(String[] args) {
        System.out.println("Delivery Charge:- "+Order.deliveryCharge);
        Order o1=new RegularOrder(678,400);
        Order o2=new PremiumOrder(786,700);
        o1.displayDetail();
        System.out.println("total bill for Regular:- "+o1.calculateBill());
        o2.displayDetail();
        System.out.println("total bill for premium:- "+o2.calculateBill());
    }
}
