import java.util.Scanner;
class distance{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter foot");
double a=sc.nextDouble();
double b=0.333*a;
double c=a*0.000189;
System.out.println("in yards"+b);
System.out.println("in miles"+c);
}}