package com.OnlineFoodDeliveryApp;

public class Order {
    int orderId;
    double baseAmount;
    static int deliveryCharge=40;
    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }
    public double calculateBill(){
        return 0.0;
    }
    public void displayDetail(){
        System.out.println("OrderId "+orderId +" BaseAmount "+baseAmount);
    }
}
