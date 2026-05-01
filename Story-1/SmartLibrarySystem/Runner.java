package com.SmartLibrarySystem;

public class Runner {
    static void main(String[] args) {
        int lateDays=30;
        System.out.println("Welcome to Library");
        Book b1=new TextBook(134,"JAVABasic",40000);
        Book b2=new Magazine(121,"VOGUE",500000);
        b1.displayDetail();
        System.out.println("fine for "+lateDays+" days late "+b1.calculateFine(lateDays));
        System.out.println("---------------------------------------------------------------------");
        b2.displayDetail();
        System.out.println("fine for "+lateDays+" days late "+b2.calculateFine(lateDays));
    }
}
