package com.OnlineFoodDeliveryApp;

public class RegularOrder extends Order{
    public RegularOrder(int orderId,double baseAmount){
        super(orderId,baseAmount);
    }
    public double calculateBill(){
        return baseAmount+deliveryCharge;
    }
}
