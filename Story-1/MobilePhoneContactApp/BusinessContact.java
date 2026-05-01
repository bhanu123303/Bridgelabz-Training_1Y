package com.MobilePhoneContactApp;

public class BusinessContact extends Contact{
    String companyName;
    public BusinessContact(String name,long phoneNumber,String companyName){
        super(name,phoneNumber);
        this.companyName=companyName;
    }
    public void displayDetail(){
        System.out.println("Business Contacts");
        System.out.println("NAME :-"+name.toUpperCase());
        System.out.println("PHONE :-"+phoneNumber);
        System.out.println("COMPANY :-"+companyName);
    }
}
