package com.Wrapper;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public void autoBoxing(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("List"+list);
        int sum=0;
        for(Integer num:list){
            sum+=num;
        }
        System.out.println(sum);


    }

    static void main(String[] args) {
        Question3 q1=new Question3();
        q1.autoBoxing();
    }
}
