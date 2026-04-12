package com.Wrapper;

public class Question2 {
    public void wrapperToPrimitive(){
        Double num1=33.33;
        double num2=33.33;
        int num3=(int)num2;
        System.out.println("double object :-"+num1);
        System.out.println("double primitive :-"+num2);
        System.out.println("int primitive :-"+num3);
    }

    static void main(String[] args) {
        Question2 q1 =new Question2();
        q1.wrapperToPrimitive();

    }
}
