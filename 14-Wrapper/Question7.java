package com.Wrapper;

import java.util.ArrayList;

public class Question7 {
    static void main(String[] args) {
        double[] price={10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> p1=new ArrayList<Double>();
        for(double p:price){
            p1.add(p);
        }
        double max=p1.get(0);
        double total=0;
        for(double val:p1){
            if(val>max){
                max=val;
                total+=val;
            }
            System.out.println("Highest "+max);
            System.out.println("Average "+(total/p1.size()));
        }
    }
}
