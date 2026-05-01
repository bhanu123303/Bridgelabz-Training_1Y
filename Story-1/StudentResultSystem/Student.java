package com.StudentResultSystem;

public class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public String calculateGrade(){
        if(marks>90){
            return "O";
        }else if(marks>=80){
            return "A";
        }else if(marks>=70){
            return "B";
        }else{
            return "pass";
        }
    }
    public void DisplayDetail(){
        System.out.println("ROLL NO :- "+rollNo);
        System.out.println("NAME :-"+ name);
        System.out.println("MARKS :- "+marks);
        System.out.println("GRADES :-"+calculateGrade());
    }
}
