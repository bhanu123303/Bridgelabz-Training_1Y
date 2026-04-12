package com.Wrapper;
import java.util.*;
public class Question1 {
    public void primitiveToWrapper(){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Integer num2=num1;
        System.out.println("Primitive Datatype"+num1);
        System.out.println("Object datatype"+num2);

    }
    static void main(String[] args) {
        Question1 w1=new Question1();
        w1.primitiveToWrapper();
    }

}
