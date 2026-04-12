package com.Wrapper;

public class Question6{
    static void main(String[] args) {
        String[]n={"123","abc","45.6","0"};
        for(int i=0;i< n.length;i++) {
            int result;
            try {
                result = Integer.parseInt(n[i]);
            } catch (NumberFormatException e) {
                result= - 1;
            }
            System.out.println("Enter n:-"+n[i]);

        }
    }
}
