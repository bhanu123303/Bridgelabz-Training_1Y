package com.StudentResultSystem;

public class EngineeringStudent extends Student{
    String Branch;
    public EngineeringStudent(int rollNo,String name,double marks,String Branch){
        super(rollNo,name,marks);
        this.Branch=Branch;
        this.name=name;
    }
    public void displayResult(){
        System.out.println("Engineering Result");
        super.DisplayDetail();
    }
}
