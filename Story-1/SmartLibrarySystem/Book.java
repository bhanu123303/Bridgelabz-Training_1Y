package com.SmartLibrarySystem;
public class Book {
    int bookid;
    String title;
    double price;

    public Book(int bookid, String title, double price) {
        this.bookid = bookid;
        this.title = title;
        this.price = price;
    }
    public int calculateFine(int dayLate){
        return 0;
    }
    public void displayDetail(){
        System.out.println("ID "+ bookid + " Title "+title+" Price "+price);
    }
}

