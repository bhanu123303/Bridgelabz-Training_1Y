package com.SmartLibrarySystem;

public class Magazine extends Book{
    public Magazine(int bookid, String title,double price){
        super(bookid,title,price);
    }
    public int calculateFine(int daysLate){
        return daysLate*5;
    }
}
