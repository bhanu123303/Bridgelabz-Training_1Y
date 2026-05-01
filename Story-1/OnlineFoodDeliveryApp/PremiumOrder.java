package com.OnlineFoodDeliveryApp;

public class PremiumOrder extends Order {
    public PremiumOrder(int orderId,double baseAmount){
        super(orderId,baseAmount);
    }
    public double caluclateBill(){
        double discount=baseAmount=baseAmount*0.20;
        return (baseAmount-discount)+deliveryCharge;
    }
}
