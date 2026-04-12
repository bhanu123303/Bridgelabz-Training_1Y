package com.Wrapper;

public class Question4 {
    public void wrapperCpmparasion(){
        Integer a=100;
        Integer b=100;
        Integer c=200;
        Integer d=200;
        System.out.println("Compare a and b "+(a==b));
        System.out.println("Compare c and d "+(c==d));
    }

    static void main(String[] args) {
        Question4 q4=new Question4();
        q4.wrapperCpmparasion();
    }
}
