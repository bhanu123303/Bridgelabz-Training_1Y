package com.MobilePhoneContactApp;

public class Runner {
    static void main(String[] args) {
        Contact c1=new Contact("Khushi ",234444090);
        Contact c2=new BusinessContact("Justin",234557564,"jb music");
        System.out.println("--- Regular Contact ---");
        c1.displayDetail();
        System.out.println("---Business Contact---");
        c2.displayDetail();
    }
}
