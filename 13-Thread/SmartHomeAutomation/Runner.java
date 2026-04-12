package com.thread.SmartHomeAutomation;
public class Runner {
    public static void main(String[]args){
        SmartHome s1=new SmartHome("Temp sensor",5000);
        SmartHome s2=new SmartHome("Security camera",3000);
        SmartHome s3=new SmartHome("Light Controller",4000);
        SmartHome s4=new SmartHome("DoorLock Monitor",6000);
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2);
        Thread t3=new Thread(s3);
        Thread t4=new Thread(s4);
        t1.setPriority(7);
        t2.setPriority(10);
        t3.setPriority(5);
        t4.setPriority(5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
