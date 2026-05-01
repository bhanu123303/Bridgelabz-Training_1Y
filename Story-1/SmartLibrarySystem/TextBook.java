package com.SmartLibrarySystem;

public class TextBook extends Book{
    public TextBook(int bookid, String title,double price){
        super(bookid,title,price);
    }
    public int calculateFine(int daysLate){
        return daysLate*2;
    }
}
