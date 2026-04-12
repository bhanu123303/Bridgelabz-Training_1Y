package com.thread.OnlineFoodDeliverySystem;

public class Order implements Runnable{
    String Restaurantname;
    int orderId;
    int deliveryTime;

    public Order(String Restaurantname,int orderId,int deliveryTime ){
        this.deliveryTime=deliveryTime;
        this.orderId=orderId;
        this.deliveryTime=deliveryTime;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Picked up order "+orderId);
       long time=deliveryTime*1000;
       try{
           System.out.println("Order "+orderId+" ---> In transit");
           Thread.sleep(time);
       }catch(Exception e){
           System.out.println(e);

        }
           System.out.println("Order " + orderId + " ---> Delivered");
           System.out.println("****************************************************************************");
    }
}
