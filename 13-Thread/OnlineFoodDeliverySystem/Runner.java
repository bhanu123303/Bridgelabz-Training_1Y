package com.thread.OnlineFoodDeliverySystem;

public class Runner {
    public static void main(String[] args) {
        Order o1=new Order("Brajwasi",121,2);
        Order o2=new Order("truckRoofTop",111,4);
        Order o3=new Order("koreanRestaurant",34,6);
        Order o4=new Order("Shankar",151,7);
        Order o5=new Order("Dominos",231,9);
        Thread t1=new Thread(o1,"Express ");
        Thread t2=new Thread(o2,"Standard ");
        Thread t3=new Thread(o3,"Economy ");
        Thread t4=new Thread(o4,"Standard ");
        Thread t5=new Thread(o5,"Express ");
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t4.setPriority(5);
        t5.setPriority(10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t4.start();
        t5.start();

    }
}
