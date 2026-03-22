package Q2;

import java.util.Scanner;
public class Run {
    public static void main(String[] args) {
        System.out.println("Enter 1 for car");
        System.out.println("Enter 2 for Bus");
        Scanner sc=new Scanner(System.in);
       int choice=sc.nextInt();

       if(choice==1){
           System.out.println("no of days car rented");
           int n= sc.nextInt();
           Vehicle c1=new Car();
           c1.rent(n);
           c1.returnVehicle();}
    else {
           System.out.println("np of days bus rented");
           int s= sc.nextInt();
        Vehicle b1=new Bus();
        b1.rent(s);
        b1.returnVehicle();}
    }
}
