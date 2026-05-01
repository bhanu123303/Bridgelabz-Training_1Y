package com.MobilePhoneContactApp;

public class Contact {
    String name;
    long phoneNumber;

    public Contact(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public int BusinessContact(){
        return 0;
    }
    public void displayDetail(){
        System.out.println("Name :- "+name+" phone Number :-"+phoneNumber);
    }
}
