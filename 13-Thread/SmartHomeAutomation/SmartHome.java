package com.thread.SmartHomeAutomation;

public class SmartHome implements Runnable{
    String devicename;
    int interval;

    public SmartHome(String name,int interval){
        this.devicename=name;
        this.interval=interval;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("which device "+devicename + " at what interval "+interval);
            System.out.println("------------------------------------------------------------");
            try{
                Thread.sleep(interval);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("********************************************************************");

    }

}
